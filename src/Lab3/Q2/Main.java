public class Main {
	public static void main(String[] args) {
		Fraction a, b , c , d;

		a = new ObjectFractionAdapter(new LongFraction(1,2)); // 1/2
		b = new ObjectFractionAdapter(new LongFraction(1,4)); // 2/3

		 c = new ClassFractionAdapter(1,2);
		 d = new ClassFractionAdapter(1,4);

		System.out.println("Object Adapter:");
		System.out.println(a + "+" + b + "=" + a.add(b));
		System.out.println(a + "-" + b + "=" + a.subtract(b));
		System.out.println(a + "-" + 1 + "=" + a.subtract(1));
		System.out.println(a + "+" + 1 + "=" + a.add(1));

		System.out.println("");

		System.out.println("Class Adapter");
		System.out.println(c + "+" + d + "=" + a.add(b));
		System.out.println(c + "-" + d + "=" + a.subtract(b));
		System.out.println(c + "-" + 1 + "=" + a.subtract(1));
		System.out.println(c + "+" + 1 + "=" + a.add(1));
	}
}