public class OurString {
    public static void main(String[] args) {

        //в строке Hello ,буквы имеют индекс начиная с нуля с лева направо
        String hello = "Hello";
        // charAt() - находит символ в строке (по индексу)

        char ein =  hello.charAt(0);
        char drei = hello.charAt(2);
        System.out.println(ein + " " + drei);
    }

}
