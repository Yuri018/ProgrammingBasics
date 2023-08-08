package practicum;

public class DateCompare {
    public static void main(String[] args) {

        System.out.println(dateCompare(1, 1, 2023, 2, 2, 2024));
        System.out.println(dateCompare(1, 1, 2025, 2, 2, 2024));
        System.out.println(dateCompare(1, 1, 2023, 1, 1, 2023));

        System.out.println(dateCompare2(1, 1, 2023, 2, 2, 2024));
        System.out.println(dateCompare2(1, 1, 2025, 2, 2, 2024));
        System.out.println(dateCompare2(1, 1, 2023, 1, 1, 2023));

    }
    public static int dateCompare(int day1, int month1, int year1, int day2, int month2, int year2){
        if (year1 < year2){
            return 1;
        } else if (year1 > year2) {
            return -1;
        } else {
            if (month1 < month2){
                return 1;
            } else if (month1 > month2) {
                return -1;
            } else {
                if (day1 < day2){
                    return 1;
                } else if (day1 > day2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    public static int dateCompare2(int day1, int month1, int year1, int day2, int month2, int year2){
        int date1 = year1 * 10000 + month1 * 100 + day1;
        int date2 = year2 * 10000 + month2 * 100 + day2;

        if (date1 == date2){
            return 0;
        }
        return date1 < date2 ? 1 : -1;
    }
}
