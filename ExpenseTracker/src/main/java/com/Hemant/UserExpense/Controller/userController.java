package com.Hemant.UserExpense.Controller;

import com.Hemant.UserExpense.Service.AuthenticationTokenService;
import com.Hemant.UserExpense.Service.userService;
import com.Hemant.UserExpense.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class userController {
    @Autowired
    userService userService;
    @Autowired
    AuthenticationTokenService authenticationTokenService;
    @PostMapping("user/signUp")
    public String userSignUp(@RequestBody User newUser){
        return userService.userSignUp(newUser);
    }
    @PostMapping("user/signIn")
    public String userSignIn(@RequestParam String userName,@RequestParam String userPassword ){
        return userService.userSignIn(userName,userPassword);
    }
}
