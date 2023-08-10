package practicumPrivateFields;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("John", 30);
        Person p2 = new Person("Max", 25);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("The age of p1 is " + p1.getAge());
    }
}
