package practicum;

public class ShowDayOfTheYear {
    public static void main(String[] args) {
        //Написать метод,, который принимает 3 числа int (day, month, year) возвращает строку вида "08. August 2023 "

        int day = 8;
        int month = 8;
        int year = 2023;

//        showDayOfThYear(day, month, year);
//        System.out.println(showDayOfThYear2(day, month, year));
        System.out.println(showDayOfThYear3(day, month, year));
    }

    public static void showDayOfThYear(int d, int m, int year) {
        switch (m) {
            case 8: {
                String month = "August";
                System.out.println("0" + d + ". " + month + " " + year);
                break;
            }
        }
    }

    public static String showDayOfThYear2(int d, int m, int year) {
        String res;
        String month = "";
        switch (m) {
            case 1:
                month = "January";
                break;
            case 8:
                month = "August";
                break;

        }
        res = (d < 10 ? "0" : "") + d + ". " + month + " " + year;
        return res;
    }

    public static String showDayOfThYear3(int d, int m, int year) {
        String[] months = {"", "", "", "", "", "", "January", "August"};
        return (d < 10 ? "0" : "") + d + ". " + months[m - 1] + " " + year;
    }
}
