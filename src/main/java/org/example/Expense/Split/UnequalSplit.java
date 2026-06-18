package org.example.Expense.Split;

import java.util.List;

public class UnequalSplit implements ExpenseSplit{

    @Override
    public boolean validateRequest(List<Split> splits, double amount) {
        double total = 0;
        for (Split split : splits) {
            total += split.getAmount();
        }
        return total == amount;
    }
}
