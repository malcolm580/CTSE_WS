package Lab4.Part1.AttractFactoryPattern;

public class TestAbstractFactory {
	public static void main(String[] args) {
		String [] factories = {"Part1.AttractFactoryPattern.ConcreteFactory1", "Part1.AttractFactoryPattern.ConcreteFactory2"};
		try {
			Client c = new Client();
			int choice = Integer.parseInt(args[0]);

			AbstractFactory af = 
					(AbstractFactory)Class.forName(factories[choice]).newInstance();

			System.out.println("FoodItem A Created : "
							+ c.createA(af).getName());
			System.out.println("FoodItem B Created : "
							+ c.createB(af).getName());
		}
		catch (Exception e) {
			System.out.println("Problem encountered");
		}
	}
}