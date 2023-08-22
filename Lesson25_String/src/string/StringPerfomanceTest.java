package string;

public class StringPerfomanceTest {
    private static final int N_ITERATION = 150_000;
    private static final String WORD = "may";

    public static void main(String[] args) {
        String str = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < N_ITERATION; i++) {
            str = str + WORD;
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);

        StringBuilder builder = new StringBuilder();
        start = System.currentTimeMillis();
        for (int i = 0; i < N_ITERATION; i++) {
            builder.append(WORD);
        }
        str = builder.toString();
        finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }
}


