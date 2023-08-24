package homeWork26.model;

import homeWork26.forms.Shape;

public class Triangle extends Shape {
    public Triangle(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    public double calcPerimeter() {
        return side * 3;
    }
}
