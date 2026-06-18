package org.example.Expense.Split;

public class SplitFactory {

    public ExpenseSplit getExpenseSplit(ExpenseSplitType type) {
        switch (type) {
            case EQUAL_SPLIT -> {
                return new EqualSplit();
            }
            case UNEQUAL_SPLIT -> {
                return new UnequalSplit();
            }
            case PERCENTAGE_SPLIT -> {
                return new PercentageSplit();
            }
            default -> throw new RuntimeException("Incorrect split type");
        }
    }
}
