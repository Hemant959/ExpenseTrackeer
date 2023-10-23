package com.Hemant.User_Expense.Controller;

import com.Hemant.User_Expense.Service.expenseService;
import com.Hemant.User_Expense.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class expenseController {
    @Autowired
    expenseService expenseService;
    @PostMapping("Expense/Create")
    public String createExpense(@RequestBody Expense newExpense){
       return expenseService.createExpense(newExpense);
    }
    @GetMapping("Expense/Read")
    public List<Expense> GetExpense(){
        return expenseService.GetExpense();
    }
    @PutMapping("Expense/Update")
    public String updateExpense(@RequestParam Long id,String description){
        return expenseService.updateExpense(id,description);
    }
    @DeleteMapping("Expense/Delete")
    public String deleteExpenseById(@RequestParam Long id){
        return expenseService.deleteExpenseById(id);
    }
}
