package Assignment;

public abstract class CreateCommand implements Command{

    private FoodItem p;

    public abstract FoodItem factoryMethod();

    public void run(){
        p = factoryMethod();
        System.out.println(p.getName()+" Created");
    }

    @Override
    public void undo() {
        int lastProdtctIndex = productVector.size()-1;
        productVector.remove(productVector.indexOf(productVector.size()));
    }

    public FoodItem getP() {
        return p;
    }

    public void setP(FoodItem p) {
        this.p = p;
    }
}
