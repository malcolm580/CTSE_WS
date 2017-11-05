package Assignment.Stock;

public class Rice extends FoodItem {

    protected String type;

    public Rice(String[] lineSplit) {
        super( Integer.parseInt(lineSplit[0]) , lineSplit[1]);
        this.type = lineSplit[2];
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Rice created: ( ItemId: " +itemID+ " Name: " + name + " Balance: " + balance +" Type: " +type + ")";
    }
}
