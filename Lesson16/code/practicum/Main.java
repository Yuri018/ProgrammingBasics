package practicum;

public class Main {
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        date1.day = 1;
        date1.month = 8;
        date1.year = 2023;

        System.out.println(showDayOfThYear3(date1));

        Cat barsik = new Cat();
        barsik.name = "Barsik";
        barsik.age = date1;
//        barsik.age = 7;
        barsik.color = "black";
        barsik.isSleep = false;

        printGat(barsik);


    }
    public static String showDayOfThYear3(MyDate date) {
        String[] months = {"", "", "", "", "", "", "January", "August"};
        return (date.day < 10 ? "0" : "") + date.day + ". " + months[date.month - 1] + " " + date.year;
    }

    public static void printGat(Cat cat){
        System.out.println(cat.name + " " + showDayOfThYear3(cat.age) + " " + cat.color);
    }

}
