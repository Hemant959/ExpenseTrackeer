package com.Hemant.UserExpense.Repo;

import com.Hemant.UserExpense.model.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPTokenRepo extends JpaRepository<AuthenticationToken,Long> {
}
