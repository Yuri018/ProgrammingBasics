package homeWork26.model;

import homeWork26.forms.Shape;

public class Circle extends Shape {
    public Circle(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        return side * side * Math.PI;
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * side;
    }
}
