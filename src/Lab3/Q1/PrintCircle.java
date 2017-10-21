public class PrintCircle {
    public static void printCircle(NewCircle newCircle) {
        System.out.println(" r = " + newCircle.getRadius( ));
        System.out.println("center = [" + newCircle.getCenter( ).getX()
                + " , "  + newCircle.getCenter( ).getY() + "]");
        System.out.println(" ");
    }

    public static void main(String[] args) {
        // Object Adapter
        NewCircle adapter = new CircleObjectAdapter(new OldCircleImpl( 10.0,15.0,25.5 ));
        PrintCircle.printCircle(adapter);

        // Class Adapter
        NewCircle adapter2 = new CircleClassAdapter( 10.0,15.0,25.5 );
        PrintCircle.printCircle(adapter2);
    }
}
