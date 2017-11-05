package Assignment.Stock;

public abstract class FoodItem {

    protected String name;
    protected int itemID;
    protected int balance;

    public FoodItem( int itemID , String name ) {
        this.name = name;
        try {
            this.itemID = itemID;
        }catch (NumberFormatException ex){
            System.out.print("Please enter int for ItemID");
        }
        this.balance = 0;
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

    public abstract void showInfo();
}
