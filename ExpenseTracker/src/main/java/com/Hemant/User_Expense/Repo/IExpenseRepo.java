package com.Hemant.User_Expense.Repo;

import com.Hemant.User_Expense.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExpenseRepo extends JpaRepository<Expense,Long> {

}
