package org.example.User;

import org.example.UserExpenseBalanceSheet;

import java.util.concurrent.atomic.AtomicInteger;

public class User {

    private String userId;
    private String username;
    private UserExpenseBalanceSheet expenseBalanceSheet;


    public User(String userId, String name) {
        this.userId = userId;
        this.username = name;
        this.expenseBalanceSheet = new UserExpenseBalanceSheet();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserExpenseBalanceSheet getExpenseBalanceSheet() {
        return expenseBalanceSheet;
    }

    public void setExpenseBalanceSheet(UserExpenseBalanceSheet expenseBalanceSheet) {
        this.expenseBalanceSheet = expenseBalanceSheet;
    }


}
