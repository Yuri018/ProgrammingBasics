public class Main05 {
    public static void main(String[] args) {

        //методы работы состроками
        String world = "world";

        //Method substrung()

        String subString = world.substring(1);
        // от указанного индекса и до конца строки
        System.out.println(subString);

        subString = world.substring(1, 3);
        //в данном случае второй аргумент не включается в подстроку
        System.out.println(subString);
    }
}
