package practicumWhileLoop;

public class Main07 {
    public static void main(String[] args) {

        //WHILE Loop
        //while (condition булево Условие) {statement команда или несколько команд через ;}

        int i = 1; // присвоение начального значения

        while (i <= 5) {
            System.out.println(i++);
        }

        int j = 5;

        while (j >= 1) {
            System.out.println(j--);
        }

        char ch = 'a';
        while (ch <= 'z') {
            System.out.println(ch + " ");
            ch++;
        }

        //написать программу считающую сумму чисел

        int y = 1;
        int sum = 0;
        while (y <= 5) {
            sum = sum + y;
            y++;
        }
        System.out.println(" sum of 5 digits is " + sum);

        // DO-WHILE loop
        //проверка условия происходит в конце цикла

        int g = 0;
        do {
            System.out.println(g);
            g--;
        } while (g >= 1); //сначала сработало тело цикла, потом проверка

        //циклы могут быть вложенными, находиться друг в друге

        //таблица умножения
        int i1 = 1;
        while (i1 <= 9) {

            int j1 = 1;
            while (j1 <= 9) {
                System.out.println(i1 + " * " + j1 + " = " + i1 * j1);
                j1++;
            }
            System.out.println("--------");
            i1++;
        }
    }
}
