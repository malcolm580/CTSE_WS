package Lab4.Part1.AttractFactoryPattern;

public class Client {

	public AbstractProductA createA(AbstractFactory af) {
		return af.createProductA();
	}
	
	public AbstractProductB createB(AbstractFactory af) {
		return af.createProductB();
	}
	
}