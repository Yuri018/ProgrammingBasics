package homeWork16;

public class Main {
    public static void main(String[] args) {
        /*
         Создать класс Student со следующими полями
         (String firstName, String lastName, MyDate birthday, String group, MyDate startCourse}
         Создайте пару объектов этого класса. Напишите метод studentToString(Student student)
         который возвращает строку с данными студента.
         */
        MyDate birthdaySt1 = new MyDate();
        birthdaySt1.day = 15;
        birthdaySt1.month = 8;
        birthdaySt1.year = 2000;

        MyDate startCourse1 = new MyDate();
        startCourse1.day = 18;
        startCourse1.month = 7;
        startCourse1.year = 2023;

        Student student1 = new Student();
        student1.firstName = "Michael";
        student1.lastName = "Schreiner";
        student1.birthday = birthdaySt1;
        student1.group = "Java Developer";
        student1.startCourse = startCourse1;

        System.out.println(studentToString(student1));
        System.out.println("-----------------------");

        MyDate birthdaySt2 = new MyDate();
        birthdaySt2.day = 10;
        birthdaySt2.month = 12;
        birthdaySt2.year = 1800;

        MyDate startCourse2 = new MyDate();
        startCourse2.day = 6;
        startCourse2.month = 5;
        startCourse2.year = 2022;

        Student student2 = new Student();
        student2.firstName = "Max";
        student2.lastName = "Codov";
        student2.birthday = birthdaySt2;
        student2.group = "Python Developer";
        student2.startCourse = startCourse2;

        System.out.println(studentToString(student2));

        /*
        Придумайте и опишите любой свой класс. Создайте объект этого класса
         */
        Patient patient = new Patient();
    }

    static String studentToString(Student student) {
        return student.firstName + " " + student.lastName + "\nBirthday: " + dateToString(student.birthday)
                + "\n" + student.group + "\nStart Course " + dateToString(student.startCourse);
    }

    static String dateToString(MyDate date) {
        return (date.day < 10 ? "0" : "") + date.day + "." + (date.month < 10 ? "0" : "")
                + date.month + "." + date.year;
    }
}
