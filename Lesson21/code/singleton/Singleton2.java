package singleton;

public class Singleton2 {

    //второй вариант создания Singleton: присваиваем переменной создание нового обекта класса Singleton
    // и установка флага final
    public static final Singleton2 INSTANCE = new Singleton2();

    private Singleton2() {
    }

}
