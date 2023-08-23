package homeWork26;

import homeWork26.forms.Shape;
import homeWork26.model.Circle;
import homeWork26.model.Square;
import homeWork26.model.Triangle;

public class FigureAppl {
    public static void main(String[] args) {

        /*
        Create an abstract class Shape with field side type double and an abstract methods calcArea and calcPerimeter.
        Create classes Circle, Triangle, Square which extends class Shape and implements abstract methods.
        Write class FigureAppl with method main. In method create array of Shapes.
        Add to array two circles, one triangle and one square.
        Calculate total area and total perimeter of all figures from array of Shapes.
        Calculate total area of circles. (*)
        P.S. We are bear in mind regular shapes
         */

        Shape[] shape = new Shape[5];
        shape[0] = new Circle(20.0);
        shape[1] = new Circle(30.0);
        shape[2] = new Triangle(40.0);
        shape[3] = new Square(15.0);

        System.out.printf("Area of all figures %.2f cm\n", totalArea(shape));
        System.out.printf("Perimeter of all shapes %.2f cm\n", totalPerimeter(shape));
        System.out.printf("Area of all circles %.2f cm\n", totalAreaCircle(shape));
    }

    public static double totalArea(Shape[] arr) {
        double totalArea = 0;
        for (Shape shape : arr) {
            if (shape != null) {
                totalArea += shape.calcArea();
            }
        }
        return totalArea;
    }

    public static double totalPerimeter(Shape[] arr) {
        double totalPerimeter = 0;
        for (Shape shape : arr) {
            if (shape != null) {
                totalPerimeter += shape.calcPerimeter();
            }
        }
        return totalPerimeter;
    }

    public static double totalAreaCircle(Shape[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i] instanceof Circle) {
                total += arr[i].calcArea();
            }
        }
        return total;
    }
}
