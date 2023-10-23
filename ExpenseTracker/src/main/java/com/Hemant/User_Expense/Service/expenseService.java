package com.Hemant.User_Expense.Service;

import com.Hemant.User_Expense.Repo.IExpenseRepo;
import com.Hemant.User_Expense.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class expenseService {
    @Autowired
    IExpenseRepo iExpenseRepo;

    public String createExpense(Expense newExpense) {
        iExpenseRepo.save(newExpense);
        return "Expense Created";
    }

    public List<Expense> GetExpense() {
        return iExpenseRepo.findAll();
    }

    public String updateExpense(Long id, String description) {
        Expense ExpenseInfo = iExpenseRepo.findById(id).orElse(null);
        if (ExpenseInfo != null){
            ExpenseInfo.setDescription(description);
            iExpenseRepo.save(ExpenseInfo);
            return " Expense  Updated Successfully";
        }
        return "Expense not found";
    }
    public String deleteExpenseById(Long id) {
        iExpenseRepo.deleteById(id);
        return "Expense Deleted";
    }
}
