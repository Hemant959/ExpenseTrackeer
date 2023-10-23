package com.Hemant.User_Expense.Service;

import com.Hemant.User_Expense.Repo.IUserRepo;
import com.Hemant.User_Expense.Service.hashingUtility.PasswordEncryptor;
import com.Hemant.User_Expense.model.AuthenticationToken;
import com.Hemant.User_Expense.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class userService {
    @Autowired
    IUserRepo iUserRepo;
    @Autowired
    AuthenticationTokenService authenticationTokenService;
    @Autowired
    pTokenService pTokenService;

    //Sign_Up
    public String userSignUp(User newUser) {
        String name = newUser.getUserName();
        User existingUser = iUserRepo.findFirstByUserName(name);
        if (existingUser != null) {
            return "user Already exist.";
        }
        String signUpPassword = newUser.getUserPassword();
        try {
            String encryptedPassword = PasswordEncryptor.encrypt(signUpPassword);

            newUser.setUserPassword(encryptedPassword);

            // patient table - save User
            iUserRepo.save(newUser);
            return "user registered";

        } catch (NoSuchAlgorithmException e) {

            return "Internal Server issues while saving password, try again later!!!";
        }
    }

    //Register
    public String userSignIn(String userName, String userPassword) {
        User existingUser = iUserRepo.findFirstByUserName(userName);

        if(existingUser == null){
            return "Not a valid Name, Please sign up first !!!";
        }
        try {
            String encryptedPassword = PasswordEncryptor.encrypt(userPassword);

            if(existingUser.getUserPassword().equals(encryptedPassword)){
                // return a token for this sign in
                AuthenticationToken token  = new AuthenticationToken(existingUser);
                pTokenService.createToken(token);
                return "logged in";
            }else{
                //password was wrong!!!
                return "Invalid Credentials!!!";
            }
        } catch (NoSuchAlgorithmException e) {

            return "Internal Server issues while saving password, try again later!!!";
        }

    }

}
