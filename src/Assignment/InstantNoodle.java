package Assignment;

public class InstantNoodle extends FoodItem {

    protected int weight;

    public InstantNoodle(String name, int itemID, int balance, int weight) {
        super(name, itemID, balance);
        this.weight = weight;
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
