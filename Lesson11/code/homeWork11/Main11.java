package homeWork11;

import java.util.Random;
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        //Task 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input miles:");
        double speedMile = scanner.nextDouble();

        converter(speedMile);
        scanner.close();
        System.out.println("\n-----------------------------");

        //Task 2
        int[] array = {14, 73, 28, 8, -15, -45, 21, -999};
        sumOfArray(array);
        System.out.println("-----------------------------");

        //Task 3
        flipArray(array);
        System.out.println("\n-----------------------------");

        //Task 4
        Random random = new Random();
        long[] accountArray = new long[20];
        for (int i = 0; i < accountArray.length; i++) {
            accountArray[i] = random.nextLong(10_000, 100_000_000);
        }
        accountBalance(accountArray);
    }

    public static void converter(double x) {
        double speedKm = x * 1.609;
        System.out.printf("%.2f  miles/hour = %.2f kilometers/hour", x, speedKm);
    }

    public static void sumOfArray(int[] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("sum of array elements = " + sum);
    }

    public static void flipArray(int[] arr){
        for (int a : arr){
            System.out.print(a + "|");      //array printing
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + "|");//printing an array in reverse
        }
    }

    public static void accountBalance(long[] arr){
        for (long a : arr){
            System.out.print(a + "|");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / 100;//denomination :(
        }
        for (long a : arr){
            System.out.print(a + "|");
        }
    }

}
