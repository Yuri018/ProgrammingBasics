package practicumLoopFor;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        /*
        Задание 1. Имеется целое число n, задайте его самостоятельно в программе.
        Выясните, является ли это число четным? Является ли это число кратным 3?
        Кратным 5? Кратным 10?
         */

        int n = 18;

        //число четное - делится на 2 без остатка

        if (n % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        //число кратное 3 - делится на 3 без остатка

        int k = 11;
        if (k % 3 == 0){
            System.out.println("The number " + k + " is divided bey 3");
        } else {
            System.out.println("The number " + k + " is not divided bey 3");
        }

        //число кратное 5 - делится на 53 без остатка

        int l = 45;
        if (l % 5 == 0){
            System.out.println("The number " + l + " is divided bey 5");
        } else {
            System.out.println("The number " + l + " is not divided bey 5");
        }

    }
}
