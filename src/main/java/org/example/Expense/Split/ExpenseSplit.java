package org.example.Expense.Split;

import java.util.List;

public interface ExpenseSplit {

    boolean validateRequest(List<Split> splits, double amount);

}
