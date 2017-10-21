package Lab4.Part1.FactoryPattern;

public class ConcreteProductB extends Product {

    public ConcreteProductB(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
