package practicum;

import java.util.Scanner;

public class GameGuessNumber {
    /*
    написать игру "Угадай число", которой за ограниченное число попыток ввода числа с клавы
    нужно угадать число от 0 до 9

    Условия:
    1. Код игры в классе GameGuessNumber
    2. Класс должен содержать;
        -сканер
        -secret, в который записано секретное число
        - метод, считывающий количество предоставляемых попыток
        - метод, считывающий вводимое число
        - метод, содержащий логику игры
        - метод, обьединяющий все методы
     */
    static Scanner scanner = new Scanner(System.in);
    static int secret = 9;

    public static void main(String[] args) {
        start();
    }

    static void start(){
        int attempts = readNumberOfAttempts();
        guessNumber(attempts);
        scanner.close();
    }

    static int readNumberOfAttempts(){
        System.out.println("Enter number of attempts");
        return scanner.nextInt();
    }

    static int readNumber(){
        System.out.println("Enter number from 0 to 9");
        return scanner.nextInt();
    }

    static void guessNumber(int attempts){
        while (attempts > 0){
            int number = readNumber();
            attempts--;
            if (number == secret){
                System.out.println("Bingo!!!");
                return;
            } else {
                System.out.println("Wrong! You have " + attempts + " attempts left");
            }
        }
        System.out.println("Sorry.");
    }

}
