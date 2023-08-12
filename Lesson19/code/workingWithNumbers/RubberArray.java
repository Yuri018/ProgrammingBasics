package workingWithNumbers;

import java.util.Scanner;

public class RubberArray {
    private int size;
    private int[] array = new int[3];

    public void scanner() {
        System.out.println("Input numbers:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num != 0) {
            addToArray(num);
            num = scanner.nextInt();
        }
        scanner.close();
        printingAnswers();

    }

    public void addToArray(int element) {
        if (size < array.length) {
            array[size] = element;
            size++;
        } else {
            increaseArray();
            array[size] = element;
            size++;
        }
    }

    private void increaseArray() {
        int[] tempArray = new int[array.length * size];
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }
        array = tempArray;
    }

    public void printingAnswers() {
        String result = "";
        double average = 0.0;
        for (int i = 0; i < size; i++) {
            result += array[i] + "|";
            average += (double) array[i] / size;
        }
        System.out.println("You have input the following numbers: |" + result);
        System.out.println("Total " + size + " numbers");
        System.out.printf("Average value: %.2f", average);
    }
}

