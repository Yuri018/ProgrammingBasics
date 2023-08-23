package homeWork26.model;

import homeWork26.forms.Shape;

public class Triangle extends Shape {
    public Triangle(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        return (side * side) / 2;
    }

    @Override
    public double calcPerimeter() {
        return side * 3;
    }
}
