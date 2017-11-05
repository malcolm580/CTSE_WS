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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return  itemID+ "\t\t" + name + "\t\t" + balance +"\t\t" +type +"\n" ;
    }

    @Override
    public void showInfo() {
        System.out.println("ID: " + itemID);
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + balance);
        System.out.println("Type: " + type);
    }

    @Override
    public String mementoName() {
        return "RiceMemento";
    }


}
