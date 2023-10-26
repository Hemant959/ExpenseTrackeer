package com.Hemant.UserExpense.Service;

import com.Hemant.UserExpense.Repo.IPTokenRepo;
import com.Hemant.UserExpense.model.AuthenticationToken;
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
