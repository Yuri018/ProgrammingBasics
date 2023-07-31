package homeWork10;

import java.util.Scanner;

public class homeWork10 {
    public static void main(String[] args) {
        //Task 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name");
        String lastName = scanner.nextLine();
        System.out.println("Enter your age (only numbers)");
        int age = scanner.nextInt();
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("-----------------------");

        //Task 2
        factorial();
        System.out.println("-----------------------");

        //Task 2
        triangle();
        System.out.println("-----------------------");

        //Task 3
        convertFahrenheitToCelsius();
    }

    public static void factorial() {
        int factorialValue = 5;
        int factorial = 1;
        for (int i = 1; i <= factorialValue; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial " + factorialValue + "! = " + factorial);
    }

    public static void triangle() {
        System.out.println("Display a triangle:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println(i + 1);
        }
    }

    public static void convertFahrenheitToCelsius() {
        double fahrenheit = 60.5;
        double celsius = 5 * (fahrenheit - 32) / 9;
        System.out.printf("%.2f degrees Fahrenheit = %.2f degrees Celsius", fahrenheit, celsius);
    }
}
