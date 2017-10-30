package Lab5.Part3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Vector;

public class Main2 {
	
	public static void main(String[] args) {
		Vector<Shape> shapes = new Vector<Shape>();
		Stack<Command> history = new Stack<Command>();
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		Shape shape;
		Command c;
		CommandFactory factory;
		String[] factoryList = {"Lab5.Part3.UndoCommandFactory","Lab5.Part3.DrawCommandFactory","Lab5.Part3.DeleteCommandFactory","Lab5.Part3.CreateCircleFactory","Lab5.Part3.CreateRectangleFactory"};

		while (true) {
			try {
				System.out.println("0 = exit, 1 = undo, 2 = draw all shapes, " +
						"3 = delete a shape, 4 = create circle, 5 = create rectangle");
				System.out.print("Enter option: ");
				String line = br.readLine();
				int option = Integer.parseInt(line);
				switch (option) {
					case 0:
						System.out.println("-- End --");
						System.exit(0);
					case 1:
						c = history.pop();
						c.undo();
						break;
					case 2:
					case 3:
					case 4:
					case 5:
						factory = (CommandFactory) Class.forName(factoryList[option-1]).newInstance();
						factory.setShapes(shapes);
						c = factory.create();
						c.execute();
						if(factory instanceof DeleteCommandFactory || factory instanceof CreateCircleFactory || factory instanceof CreateRectangleFactory ){
							history.push(c);
						}
						System.out.println(history.size());
						break;
					default:
						throw new Exception("Invalid Option");
				}
			} catch (Exception e) {
				System.out.println("*** " + e.getMessage());
			}
			System.out.println();
		}
	}
}
