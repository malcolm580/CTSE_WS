
package Lab4.Part1.AttractFactoryPattern;
public class ConcreteFactory2 extends AbstractFactory {
	
	public AbstractProductA createProductA() {
		return new ProductA2();
	}
	
	public AbstractProductB createProductB() {
		return new ProductB2();
	}
	
}