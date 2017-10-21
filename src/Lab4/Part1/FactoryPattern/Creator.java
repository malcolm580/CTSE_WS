package Lab4.Part1.FactoryPattern;

public abstract class Creator {

    public abstract Product factoryMethod();

    public void anOperation(){
        Product p = factoryMethod();
        System.out.println(p.getName()+" Created");
    }
}
