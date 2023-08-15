package singleton;

public class Singleton {

    //вариант создания Singleton
    private static Singleton INSTANCE = null;

    public int temp;

    private Singleton(){
    }

    //создаем метод который проверяет, создан или нет класс. Если не создан - создается.
    // В противном случае возвращает существующий класс
    public static Singleton getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
