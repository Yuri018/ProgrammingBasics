package math;

public class IntegerNum {
    public static void main(String[] args) {
        System.out.println("Mathematics");

        int x = 20;
        int y = 10;

        int z = x - y;
        System.out.println("z = x + y :" + z);

        z = x * y;
        System.out.println("z = x * y :" + z);

        int a = 57;
        int b = 10;
        int c = a / b;
        System.out.println("Частное " + a + " / " + b + " = " + c);

        int d = a % b;
        System.out.println("Частное " + a + " % " + b + " = " + d);

        int n = 60 % 12;
        System.out.println(" 60 % 12 = " + n);

        System.out.println("____________________вещественные числа__________________");

        double f = 10.0d;//d можно не ставить
        double g = 9.8;
        double e = f / g;
        System.out.println("Result " + f + " / " + g + " = " + e);

        // форматированный вывод

        System.out.printf("Result: %.4f", e);

        //Преобразование типов

        int num1 = 10;
        int num2 = 3;
        double d1 = (double) num1 / (double) num2;// явное преобразование
        System.out.println();
        System.out.println(d1);

        int num3 = (int) d1;
        System.out.println(num3);

        System.out.println("______________Методы класса Math_____________");

        double r = 10;
        double length = 2 * Math.PI * r;// длина окружности
        System.out.println("Length of circle is : " + length);

        double area = Math.PI * Math.pow(r, 2); // формула площади круга Пи * r в квадрате
        System.out.println("Area of circle is : " + area);

        System.out.println("______________Инкремент и дикремент_____________");

        int i = 0;
        i++;
        System.out.println("i = " + i);
    }
}
