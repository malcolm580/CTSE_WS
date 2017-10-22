package Assignment;

public class IstantNoodle extends FoodItem {

    private int weight;

    public IstantNoodle(String name, int itemID, int balance, int weight) {
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
