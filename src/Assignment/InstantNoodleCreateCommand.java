package Assignment;

public class InstantNoodleCreateCommand extends CreateCommand {
    @Override
    public FoodItem factoryMethod() {
        return new IstantNoodle("ProductB");
    }
}
