package practicum;

import java.util.Scanner;

public class MethodsWithArguments {
    public static void main(String[] args) {
        /*
        Реализуйте метод, который вычисляет длину гипотенузы прямоугольного треугольника
        по двум заданным пользователем катетам (теорема Пифагора).
         */

        //шаг 1 создать сканер
        Scanner scanner = new Scanner(System.in);
        //шаг 2 получить данные от пользователя для этого напишем приглашение
        System.out.println("Input catet a: ");
        double a = scanner.nextDouble();
        System.out.println("Input catet b: ");
        double b = scanner.nextDouble();
        //шаг 3 создание и вызов метода
        calculatesLengthOfHypotenuse(a, b);//передали параметры в метод
    }

    public static void calculatesLengthOfHypotenuse(double x, double y){

        double c = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));//извлекаем корень квадратный
        System.out.println("Hypotenuse = " + c);
    }
}
