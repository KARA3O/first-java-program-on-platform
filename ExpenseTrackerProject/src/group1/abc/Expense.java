package group1.abc;

public class Expense extends Transaction {
    private String category;

    public Expense(String date, String category, double amount) {
        super(date, amount);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSummary() {
        return getDate() + " | " + category + " | R" + getAmount();
    }
}