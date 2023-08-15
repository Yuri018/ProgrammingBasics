package singleton;

public class Main {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton2 singleton2 = Singleton2.INSTANCE;
    }
}
