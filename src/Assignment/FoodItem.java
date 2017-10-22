package Assignment;

public abstract class FoodItem {

    protected String name;
    protected int itemID;
    protected int balance;

    public FoodItem(String name, int itemID, int balance) {
        this.name = name;
        this.itemID = itemID;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItemID() {
        return itemID;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public abstract String toString();
}
