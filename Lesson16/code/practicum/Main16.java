package practicum;

public class Main16 {
    public static void main(String[] args) {
        //Написать метод,, который принимает 3 числа int (day, month, year) возвращает строку вида "08. August 2023 "

        int day = 8;
        String month ="August";
        int year = 2023;

        showDayOfThYear(day, month, year);
    }

    public static void showDayOfThYear(int d, String m, int year){
        System.out.println("0" + d + ". " + m + " " + year);
    }
}
