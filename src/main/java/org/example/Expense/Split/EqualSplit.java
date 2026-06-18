package org.example.Expense.Split;

import java.util.List;

public class EqualSplit implements ExpenseSplit {

    @Override
    public boolean validateRequest(List<Split> splits, double amount) {
        double equalSplit = amount/splits.size();
        double total = 0;
        for (Split split : splits) {
            if (split.getAmount() != equalSplit) return false;
            total += split.getAmount();
        }
        return total == amount;
    }
}
