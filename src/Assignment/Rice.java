package Assignment;

public class Rice extends FoodItem {

    private String type;

    public Rice(String name, int itemID, int balance, String type) {
        super(name, itemID, balance);
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return null;
    }
}
