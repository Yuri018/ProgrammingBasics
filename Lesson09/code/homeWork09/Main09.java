package homeWork09;


import java.util.Arrays;
import java.util.Random;

public class Main09 {
    public static void main(String[] args) {
        //Task 1
        int factorialValue = 5;
        int factorial = 1;
        for (int i = 1; i <= factorialValue; i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial " + factorialValue + "! = " + factorial);
        System.out.println("-----------------------");

        //Task 2
        int numberOfEvenNumbers = 0;
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                numberOfEvenNumbers++;
            }
        }
        System.out.println("The number of even numbers in the array = " + numberOfEvenNumbers);
        System.out.println("-----------------------");

        //Task 3
        Random random = new Random();

        int[] evenNumbersArray = new int[10];
        int max = evenNumbersArray[0];
        int min = evenNumbersArray[0];

        for (int i = 0; i < evenNumbersArray.length; i++) {
            evenNumbersArray[i] = random.nextInt();
            if (evenNumbersArray[i] > max){
                max = evenNumbersArray[i];
                min = evenNumbersArray[i];
            } else if (evenNumbersArray[i] < min){
                min = evenNumbersArray[i];
            }
        }
        System.out.println(Arrays.toString(evenNumbersArray));
        System.out.println(max + " " + min);
        System.out.println("Difference between max and min = " + (max - min));
        System.out.println("-----------------------");

        //Task 4
        System.out.println("Display a triangle:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println(i + 1);
        }

    }
}
