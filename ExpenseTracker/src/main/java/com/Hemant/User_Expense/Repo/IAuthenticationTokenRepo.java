package com.Hemant.User_Expense.Repo;

import com.Hemant.User_Expense.model.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthenticationTokenRepo extends JpaRepository<AuthenticationToken,Long> {

}
