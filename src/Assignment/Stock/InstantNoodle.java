package Assignment.Stock;

public class InstantNoodle extends FoodItem {

    protected int weight;

    public InstantNoodle(String[] lineSplit) {
        super(Integer.parseInt(lineSplit[0]), lineSplit[1]);
        this.weight = Integer.parseInt(lineSplit[2]);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return itemID + "\t\t" + name + "\t\t" + balance + "\t\t\t" + weight + "\n";
    }

}
