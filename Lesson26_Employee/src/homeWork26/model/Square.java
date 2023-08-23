package homeWork26.model;

import homeWork26.forms.Shape;

public class Square extends Shape {
    public Square(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        return side * side;
    }

    @Override
    public double calcPerimeter() {
        return side * 4;
    }
}
