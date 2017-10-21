package Lab4.Part1.FactoryPattern;

public class ConcreteProductA extends Product {

    public ConcreteProductA (String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
