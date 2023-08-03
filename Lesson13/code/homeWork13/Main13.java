package homeWork13;

import java.util.Random;
import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        //Task 1
        int numberOThrows = 10;
        int[] result = rollThDice(numberOThrows);
        System.out.print("throw results is |");
        for (int i : result) {
            System.out.print(i + "|");
        }
        System.out.println("\n-----------------------");

        //Task 2
        //количество взял с первой задачи
        char[] arrayOfLetters = arrayWitLetters(numberOThrows);
        for (char c : arrayOfLetters) {
            System.out.print(c + "|");
        }
        System.out.println("\n-----------------------");

        //Task 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = scanner.nextInt();
        int[] result2 = numberDivisor(num);
        System.out.print("All divisors of a number " + num + " is |");
        for (int i : result2) {
            if (i != 0) {
                System.out.print(i + "|");
            }
        }
        System.out.println("\n-----------------------");

        //Task 4
        int[] arrayNum = {14, 73, 28, 8, -15, -45, 0, 21, -999};

        System.out.print("Max and Min elements array is: |");
        for (int s : maxMinArrayElement(arrayNum)){
            System.out.print(s + "|");
        }
    }

    public static int[] rollThDice(int x) {
        Random random = new Random();
        int[] result = new int[x];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(1, 7);
        }
        return result;
    }

    public static char[] arrayWitLetters(int x) {
        Random random = new Random();
        char[] result = new char[x];
        for (int i = 0; i < result.length; i++) {
            result[i] = (char) random.nextInt(65, 122);
        }
        return result;
    }

    public static int[] numberDivisor(int x) {
        int[] divisors = new int[x];
        for (int i = 1; i <= x; i++) {
            if ((x % i) == 0) {
                divisors[i - 1] = i;
            }
        }
        return divisors;
    }

    public static int[] maxMinArrayElement(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        return new int[]{max, min};
    }
}

