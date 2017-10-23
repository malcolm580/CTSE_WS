package Assignment;

public abstract class CreateCommand implements Command{

    private FoodItem p;

    public abstract FoodItem factoryMethod();

    public void run(){
        p = factoryMethod();
    }

    @Override
    public void undo() {

    }

    public FoodItem getP() {
        return p;
    }

    public void setP(FoodItem p) {
        this.p = p;
    }
}
