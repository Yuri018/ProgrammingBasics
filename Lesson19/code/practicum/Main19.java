package practicum;

public class Main19 {
    public static void main(String[] args) {

        MyDate19 date = new MyDate19(5, 8, 2020);
        System.out.println(date);

        System.out.println("Day: " + date.getDay());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Year: " + date.getYear());

        boolean format = false;

        date.setFormat(format);
        System.out.println(date);
    }
}
