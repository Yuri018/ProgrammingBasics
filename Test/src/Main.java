
public class Main {

    public static void main(String[] args) {

        double radius = 10.0;

        calculateArea(radius);

    }
    private static void calculateArea(double radius) {
        double area = radius * radius * Math.PI;
        System.out.println("Площадь круга [радиус = " + radius + "]: " + area);
    }
    private static void calculateArea(double base, double height) {
        double area = (base * height) / 2;
        System.out.println("The area of the triangle [base = " + base + ", height = " + height + "]: " + area);
    }


}
