package practicum;

import java.util.Scanner;

public class Garbage {
    public static void main(String[] args) {
        /*
         Написать метод, который получает на вход вид выбрасываемого мусора (слово),
         а возвращает цвет урны, в которую его надо выбросить.
         Протестировать метод, вызвав его в методе main.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you have - papier, bio, rest?");
        String response = returnColor(scanner.nextLine());
        System.out.println(response);
    }

    public static String returnColor(String word) {
        return switch (word) {
            case "papier" -> "blau";
            case "bio" -> "braun";
            case "rest" -> "schwarz";
            default -> "Bring package beak home";
        };
    }
}
