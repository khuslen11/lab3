package edu.cmu.cs.cs214.lab02.shapes;
import edu.cmu.cs.cs214.lab02.shapes.interfaces.Shape;
public class Square implements Shape {
    private double sideLen;

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }
    
    public double getArea() {
        return sideLen * sideLen;
    }
}
