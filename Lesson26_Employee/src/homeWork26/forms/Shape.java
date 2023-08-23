package homeWork26.forms;

public abstract class Shape {
    protected double side;

    public Shape(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public abstract double calcArea();

    public abstract double calcPerimeter();

}
