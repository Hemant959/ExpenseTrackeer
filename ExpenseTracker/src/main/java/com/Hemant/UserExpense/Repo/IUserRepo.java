package com.Hemant.UserExpense.Repo;

import com.Hemant.UserExpense.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User, Long> {
    User findFirstByUserName(String name);

}
