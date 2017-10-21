// Adapter = CircleObjectAdpater
// Target = NewCircle
// Adaptee = OldCircleImpl
// request() = Target's methods = NewCircle's method

import java.awt.*;

public class CircleObjectAdapter implements NewCircle {

    // Create a OldCircle Object
    private OldCircle adaptee;

    public CircleObjectAdapter(OldCircle adaptee) {
        this.adaptee = adaptee;
    }

    // Implement New Circle Method - getRadius()
    public double getRadius() {
        double[] ceoff = adaptee.getCoeff(); // [a , b , c ]
        double c = ceoff[2];
        return Math.sqrt(c);
    }

    // Implement New Circle Method - getCenter()
    public Point getCenter() {
        double[] ceoff = adaptee.getCoeff();
        double a = ceoff[0];
        double b = ceoff[1];
        // import java.awt.print
        // create point object
        // set the location of the Point to (a,b)
        //return the point
        Point point = new Point((int) a, (int) b);
        return point;
    }

}

