import java.awt.*;

// extend Adaptee and implements Target
class CircleClassAdapter extends OldCircleImpl implements NewCircle {

    // create itself with super class constructor
    public CircleClassAdapter(double a, double b, double c){
        super(a,b,c);
    }

    // Implement NewCircle Methods - getRadius
    public double getRadius() {
        double [] ceoff = getCoeff(); // [a , b , c ]
        double c = ceoff[2];
        return Math.sqrt(c);
    }

    // Implement NewCircle Methods - getCenter
    public Point getCenter() {
        double [] ceoff = getCoeff();
        double a = ceoff[0];
        double b = ceoff[1];
        // import java.awt.print
        // create point object
        // set the location of the Point to (a,b)
        //return the point
        Point point = new Point((int)a,(int)b);
        return point;
    }

}
