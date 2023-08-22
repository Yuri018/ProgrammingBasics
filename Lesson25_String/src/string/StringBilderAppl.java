package string;

public class StringBilderAppl {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Java");
        System.out.println(builder);
        builder.append("_").append("11");
        System.out.println(builder);
    }
}
