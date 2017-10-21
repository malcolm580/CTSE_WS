package Lab4.Part1.FactoryPattern;

public class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB("ProductB");
    }
}
