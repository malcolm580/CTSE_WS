package Lab4.Part1.FactoryPattern;

public class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA("ProductA");
    }
}
