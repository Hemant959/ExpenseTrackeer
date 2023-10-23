package com.Hemant.User_Expense.Service;

import com.Hemant.User_Expense.Repo.IAuthenticationTokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationTokenService {
    @Autowired
    IAuthenticationTokenRepo authenticationTokenRepo;
}
