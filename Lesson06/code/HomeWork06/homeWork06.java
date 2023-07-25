package HomeWork06;

public class homeWork06 {
    public static void main(String[] args) {

        //Task 1
        int a = 5, b = 10, c = 15, maxValue;
        if (a > b) {
            maxValue = a > c ? a : c;
        } else {
            maxValue = b > c ? b : c;
        }
        System.out.println("Max value is - " + maxValue);
        maxValue = a > b ? (a > c ?  a : c) : (b > c ? b : c);
        System.out.println("Max value using ternary operator is - " + maxValue);
        System.out.println("-------------------------------------------------");

        //Task 2
        int x = (int) (Math.random() * (20 + 1) - 10);
        int y = (int) (Math.random() * (20 + 1) - 10);
        //System.out.println(x + " " + y);

        if (x >= 0 & y >= 0) {
            System.out.println("1 virtel");
        } else if (x < 0 & y >= 0) {
            System.out.println("2 virtel");
        } else if (x < 0 & y < 0) {
            System.out.println("3 virtel");
        } else {
            System.out.println("4 virtel");
        }
        System.out.println("-------------------------------------------------");

        //Task 3
        int d = 1, e = 10;
        int n = (int) (Math.random() * (e + d));
        if (n == 1) {
            System.out.println(n + " корова");
        } else if (n >= 2 & n <= 4) {
            System.out.println(n + " коровы");
        } else {
            System.out.println(n + " коров");
        }
        System.out.println("-------------------------------------------------");

        //Task 4
        int year = 2023;

        if (year % 4 == 0 & year % 100 != 0) {
            System.out.println(year + " year is a leap year");
        } else if (year % 100 == 0 & year % 400 == 0) {
            System.out.println(year + " year is a leap year");
        } else {
            System.out.println(year + " year is a normal year");
        }
    }
}
