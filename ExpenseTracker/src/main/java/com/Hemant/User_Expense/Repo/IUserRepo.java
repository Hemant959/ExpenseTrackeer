package com.Hemant.User_Expense.Repo;

import com.Hemant.User_Expense.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User, Long> {
    User findFirstByUserName(String name);

}
