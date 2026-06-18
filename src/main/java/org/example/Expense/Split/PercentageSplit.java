package org.example.Expense.Split;

import java.util.List;

public class PercentageSplit implements ExpenseSplit{
    @Override
    public boolean validateRequest(List<Split> splits, double amount) {
        return false;
    }
}
