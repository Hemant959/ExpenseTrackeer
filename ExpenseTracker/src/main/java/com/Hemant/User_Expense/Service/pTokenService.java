package com.Hemant.User_Expense.Service;

import com.Hemant.User_Expense.Repo.IPTokenRepo;
import com.Hemant.User_Expense.model.AuthenticationToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class pTokenService {
    @Autowired
     IPTokenRepo ipTokenRepo;
    public  void createToken(AuthenticationToken token) {
        ipTokenRepo.save(token);
    }
}
