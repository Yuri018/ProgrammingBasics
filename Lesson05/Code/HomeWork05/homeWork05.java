package HomeWork05;

import javax.sql.rowset.spi.SyncResolver;

public class homeWork05 {
    public static void main(String[] args) {

        //Task 1
        String java = "Java";
        System.out.println(java.substring(0, java.length() / 2));
        System.out.println("-------------------------");

        //Task 2
        int a = 9, b = 8;
        if ((a == 10 || b == 10) | ((a + b) == 10)) {
            System.out.println(true);
        } else System.out.println(false);
        //вариант решения без if
        boolean c = ((a == 10 || b == 10) | ((a + b) == 10))? true: false;
        System.out.println(c);

    }
}
