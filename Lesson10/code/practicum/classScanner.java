package practicum;

import java.util.Scanner;

public class classScanner {
    public static void main(String[] args) {


//        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt(); //ожидание ввода и присвоение результата переменной
//        System.out.println("You entered number - " + num);
//        System.out.println("Enter a second number");
//        int num1 = scanner.nextInt();
//        System.out.println("You entered number - " + num1);
//        int sum = num + num1;
//        System.out.println("Sum is = " + sum);


        System.out.println("Enter your name");
        String str =  scanner.nextLine();//ожидание ввода строки и присвоение переменной
        System.out.println("Enter your age");
        String age = scanner.nextLine();// вводятся цифры в виде строки
        int ageInt =  Integer.parseInt(age);// метод перевода строки в число


        // scanner.next() - метод принимает ввод с консоли до пробела


        System.out.println(str + " " + ageInt);
        scanner.close();

    }
}
