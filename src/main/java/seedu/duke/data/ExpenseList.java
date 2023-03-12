package seedu.duke.data;

import java.util.ArrayList;

public class ExpenseList extends RecordList{

    protected static ArrayList<Record> expenseList;
    protected static int expenseCount;

    public ExpenseList() {
        expenseList = new ArrayList<>();
        expenseCount = 0;
    }
    public static void addExpense(Expense expense) {
        expenseList.add(expense);
        expenseCount++;
    }
    public static void editExpense(int i, String category, String description, String date, float value) {
        Expense exp = (Expense) expenseList.get(i - 1);
        if(!(category == null)) {
            exp.category = category;
        }
        if(!(description == null)) {
            exp.description = description;
        }
        if(!(date == null)) {
            exp.date = date;
        }
        if(!(value == 0)) {
            exp.value = value;
        }
    }
    public static void printExpenseList() {
        for (int i = 1; i <= expenseCount; i++) {
            Record record = expenseList.get(i - 1);
            System.out.println(i + ". " + record.toString());
        }
    }
}
