package homeWork17;

public class Car {
    String brand;
    String color;
    String licensePlate;
    MyDate registrationDat;
    Engine engine;

    public Car(String brand, String color, String licensePlate, MyDate registrationDat, Engine engine) {
        this.brand = brand;
        this.color = color;
        this.licensePlate = licensePlate;
        this.registrationDat = registrationDat;
        this.engine = engine;
    }

    public String toString() {
        return "brand = " + brand + "\n" + "color = " + color + "\n" + "license Plate = " + licensePlate + "\n" +
                "registration Date = " + registrationDat.toString() + "\n" + engine.toString();
    }

    public void drive(){
        engine.start();
        System.out.println(" car is driving");
    }

    public void stop(){
        engine.stop();
        System.out.println(" car stopped");
    }
}
