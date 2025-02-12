package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;


public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        Square square = new Square(4);
        Circle circle = new Circle(5);

        Renderer renderer = new Renderer(rectangle);
        Renderer renderer1 = new Renderer(square);
        Renderer renderer2 = new Renderer(circle);

        renderer.draw();
        renderer1.draw();
        renderer2.draw();
    }
}
