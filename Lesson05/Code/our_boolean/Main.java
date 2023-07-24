package our_boolean;

public class Main {
    /*
    Тип boolean
    занимает 1 бит и принимает два заначения try and false
     */
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println(b);
        System.out.println(10 < 9);
        //результатом сравнения в Java яваляется true и false

        //Relational operators
        //оператиоры сравнения
         /*
        >  больше чем
        <   меньше чем
        >=  больше или равно
        <=    меньше или равно
        ==   равно
        !=  не равно

        Результатом выполнения операторов сравнения  будет true  или false.
        Сравнивать таким образом можно типы , где определен порядок сравнения ( 2>1). Сравнивать переменные типа
        boolean  не получится, так как не определено что больше - true  или false
         */

        int i = 10;
        int j = 11;
        System.out.println("i < j " + (i < j));
        System.out.println("i > j " + (i > j));
        System.out.println("i <= j " + (i <= j));
        System.out.println("i >= j " + (i >= j));
        System.out.println("i == j " + (i == j));
        System.out.println("i != j " + (i != j));

        //Logical operators
        //Логическме операторы
         /*
         & - AND И
         | - OR ИЛИ
         ! - NOT НЕ
         ^ - XOR исключающее ИЛИ

          p        q         p & q       p | q        p^q        !p

        False   False      False       False        False      True
        True    False      False       True         True       False
        False   True       False       True         True       True
        True    True       True        True         False      False
        Когда значения p  и q разные , XOR  дает true.  Когда одинаковые, то false
          */

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 & b2); //false
        System.out.println(!(b1 & b2)); //true
        System.out.println(b1 | b2);  //true
        System.out.println(b1 ^ b2); //true

        //&& -  Conditional-AND  and
        //        || -  Conditional-OR
        //  эти операторы будут проверять второй операнд только в случае необходимости, если результат не понятен.
        // Обычные OR and AND  будут всегда проверять оба операнда.

        int n, d;

        n = 10;
        d = 0;

        if (d != 0 && (n % d) == 0) {
            System.out.println("n can be divided by d without remainder");
        }

    }
}
