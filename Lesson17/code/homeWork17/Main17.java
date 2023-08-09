package homeWork17;

public class Main17 {
    public static void main(String[] args) {
        /*
        Создать класс Car со следующими полями (String brand, String color, String licensePlate,
        MyDate registrationDate, Engine engine}
        Обратите внимание, поля registrationDate и engine - это тоже объект.
        Engine - содержмт информация о мощности двигателя и о типе (бензин, дизель, электро).

        Реализуйте метод toString в каждом классе.
        Реализуйте метод конструктор в каждом классе.
        Создайте два объекта автомобиля.
         */

        Car auto1 = new Car("Nissan", "black", "TU RY 200",
                new MyDate(5, 8, 2020), new Engine(120, "petrol"));
        System.out.println(auto1);
        System.out.println("-----------------------------------");
        Car auto2 = new Car("Lada", "Red", "a001aa777",
                new MyDate(1, 1, 1901), new Engine(1000, "gasoline"));
        System.out.println(auto2);
        System.out.println("-----------------------------------");
        /*
        В классе Engine добавте методы start и stop. Каждый из них пусть выводит строку
        "Engine is started" "Engine is stopped".
        В классе Car добавте методы drive и stop. Первый должен заводить двигатель и писать,
        что такая то машина поехала. Второй, соответственно глушить двигатель и останавливать машину.
         */

        auto1.drive();
        auto2.stop();
        /*
        Реализовать проверку, если машина уже едет, а я пытвюсь вызвать метод drive,
        должно появлятся сообщение, что машина уже едет.
         */

    }
}
