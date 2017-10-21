package Lab1.Q3;

public class Cal {

	public void compute() {
		int x = 2, y = 3;
		String s = "hello";

		log("Lab1.Q3.Cal: compute()");
		int n = method1(x, y);
		int m = method2(s);
		log("method1(" + x + "," + y + ")" + "=" + n);
		log("method2(" + s + ")" + "=" + m);
	}

	int  method1(int x, int y) {
		log("Lab1.Q3.Cal: method1(" + x + "," + y + ")");
		return x + method3(y);
	}

	int method3(int y) {
		log("Lab1.Q3.Cal: method3(" + y + ")");
		return 2*y;
	}

	int method2(String s) {
		log("Lab1.Q3.Cal: method2(" + s + ")");
		return s.length()-2;
	}

	void log (String message){
		System.out.println(message);
	}
}