package org.example.Expense;

import org.example.BalanceSheetController;
import org.example.Expense.Split.ExpenseSplit;
import org.example.Expense.Split.ExpenseSplitType;
import org.example.Expense.Split.Split;
import org.example.Expense.Split.SplitFactory;
import org.example.User.User;

import java.util.ArrayList;
import java.util.List;

public class ExpenseController {

    private List<Expense> expenseList;
    private BalanceSheetController balanceSheetController;

    public ExpenseController() {
        expenseList = new ArrayList<>();
        balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(String expenseId, String description, double totalAmount, User paidBy, List<Split> splits, ExpenseSplitType type) {
        ExpenseSplit expenseSplit = new SplitFactory().getExpenseSplit(type);

        if (expenseSplit.validateRequest(splits,totalAmount)) {
            Expense expense = new Expense(expenseId,description,totalAmount,paidBy,type,splits);
            expenseList.add(expense);
            balanceSheetController.updateUserExpenseBalanceSheet(paidBy,splits,totalAmount);
            return expense;
        }
        return null;
    }
}
