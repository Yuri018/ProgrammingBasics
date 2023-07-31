package practicum;

public class loopForEach {
    public static void main(String[] args) {

        //for-each (для каждого) используется для перебора массивов без использования индекса и длины массива

        int[] intArray = {6, 2, 8, 4, 7};

        for (int anInt : intArray) {
            System.out.print(anInt);
        }
        System.out.println();

        // continue (продолжить) используется для пропуска исполняемого кода и перехода к следующему куску кода

        for (int j : intArray) {

            if (j == 4) {
                continue;
            }
            System.out.print(j);
        }
        System.out.println();

        // break(разрыв) используется для выхода из цикла

        for (int j : intArray) {
            if (j == 8) { //в цикле встретилось значение расное J, поэтому цикл закончился
                break;
            }
            System.out.println(j);
        }

    }
}
