package practicumLoopFor;

import java.util.Arrays;
import java.util.Random;

/*
Цикл for
for (initialisation; condition; increment/decrement) {
        statement(c)
        }
     initialisation - присвоение начального значения переменной,
     которая изменяется в цикле condition.
     condition - сам цикл
     increment/decrement - увеличение или усеньшение переменной на еденицу
 */

public class Main09 {
    public static void main(String[] args) {
        Random random = new Random();

        double[] doubleRandomArray = new double[10];

        for (int i = 0; i < doubleRandomArray.length; i++) {
            double random1 =  random.nextInt(10, 21);
            doubleRandomArray[i] = random1;
            System.out.print(doubleRandomArray[i] + "|");
        }
        System.out.println("\n" + Arrays.toString(doubleRandomArray));

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

        for (int i = 0, j = 10; i <= j; i++, j-- ){//несколько значений переменных
            System.out.println(i + " " + j);
        }

        int n = 10;
        int sum = 0;
        for (int i = 0; i <= n; i++){
            sum += n;
        }
        System.out.println(sum);

        //без тела цикла
        int y;
        sum = 0;
        for (y = 0; y <= n;sum += y++);
        System.out.println("bbbb" + sum);


    }
}
