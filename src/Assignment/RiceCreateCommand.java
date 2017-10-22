package Assignment;

public class RiceCreateCommand extends CreateCommand {
    @Override
    public FoodItem factoryMethod() {
        return new Rice("ProductA");
    }
}
