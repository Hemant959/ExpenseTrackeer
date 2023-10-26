package com.Hemant.UserExpense.Service;

import com.Hemant.UserExpense.Repo.IAuthenticationTokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationTokenService {
    @Autowired
    IAuthenticationTokenRepo authenticationTokenRepo;
}
