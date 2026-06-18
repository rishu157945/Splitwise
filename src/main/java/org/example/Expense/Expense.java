package org.example.Expense;

import org.example.Expense.Split.ExpenseSplitType;
import org.example.Expense.Split.Split;
import org.example.User.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Expense {

    private String expenseId;
    private String description;
    private double amount;
    private User paidBy;
    private ExpenseSplitType expenseSplitType;
    private List<Split> splits = new ArrayList<>();

    private static AtomicInteger idGenerator = new AtomicInteger(1);

    public Expense(String expenseId, String description, double amount, User paidBy, ExpenseSplitType expenseSplitType, List<Split> splits) {
        this.expenseId = expenseId;
        this.description = description;
        this.amount = amount;
        this.paidBy = paidBy;
        this.expenseSplitType = expenseSplitType;
        this.splits = splits;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }

    public ExpenseSplitType getExpenseSplitType() {
        return expenseSplitType;
    }

    public void setExpenseSplitType(ExpenseSplitType expenseSplitType) {
        this.expenseSplitType = expenseSplitType;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public void setSplits(List<Split> splits) {
        this.splits = splits;
    }

    public static AtomicInteger getIdGenerator() {
        return idGenerator;
    }

    public static void setIdGenerator(AtomicInteger idGenerator) {
        Expense.idGenerator = idGenerator;
    }

}
