package org.example.Group;

import org.example.Expense.Expense;
import org.example.Expense.ExpenseController;
import org.example.Expense.Split.ExpenseSplitType;
import org.example.Expense.Split.Split;
import org.example.User.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Group {

    private String groupId;
    private String groupName;
    private List<User> userList;
    private List<Expense> expenseList;
    private ExpenseController expenseController;

    public Group(String groupId, String name) {
        this.groupId = groupId;
        this.groupName = name;
        this.userList = new ArrayList<>();
        this.expenseList = new ArrayList<>();
        expenseController = new ExpenseController();
    }



    public void addMember(User user) {
        this.userList.add(user);
    }

    public String getGroupId() {
        return groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public List<User> getUserList() {
        return userList;
    }

    public List<Expense> getExpenseList() {
        return expenseList;
    }

    public ExpenseController getExpenseController() {
        return expenseController;
    }

    public void createExpense(String expenseId, String description, double amount, List<Split> splits, ExpenseSplitType expenseSplitType, User paidBy) {
        Expense expense = expenseController.createExpense(expenseId,description,amount,paidBy,splits,expenseSplitType);
    }
}
