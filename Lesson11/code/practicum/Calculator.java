package practicum;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        /*
        добавить ввод чисел и математического действия пользователем;
        реализовать все вычисления методами, которые получают данные для вычислений на вход.
         */
        //шаг 1 создать сканер
        //шаг 2 получить данные от пользователя для этого напишем приглашение

        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Input first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Input action:");
            String action = scanner.next();

            System.out.println("Input second number:");
            double num2 = scanner.nextDouble();

            switch (action) {
                case "+": {
                    sum(num1, num2);
                    break;
                }
                case "-": {
                    subst(num1, num2);
                    break;
                }
                case "*": {
                    multiply(num1, num2);
                    break;
                }
                case "/": {
                    division(num1, num2);
                    break;
                }
                case "q": {
                    return;
                }
                default: {
                    System.out.println("No action");
                }
            }
        }
    }

    public static void sum(double x, double y) {
        System.out.println(x + y);
    }

    public static void subst(double x, double y) {
        System.out.println(x - y);
    }

    public static void multiply(double x, double y) {
        System.out.println(x * y);
    }

    public static void division(double x, double y) {
        System.out.println(x / y);
    }

}
