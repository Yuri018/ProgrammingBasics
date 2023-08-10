package homeWork17;

public class Car {
    String brand;
    String color;
    String licensePlate;
    MyDate registrationDat;
    Engine engine;
    boolean isDrive;

    public Car(String brand, String color, String licensePlate, MyDate registrationDat, Engine engine) {
        this.brand = brand;
        this.color = color;
        this.licensePlate = licensePlate;
        this.registrationDat = registrationDat;
        this.engine = engine;
        isDrive = false;
    }

    public String toString() {
        return "brand = " + brand + "\n" + "color = " + color + "\n" + "license Plate = " + licensePlate + "\n" +
                "registration Date = " + registrationDat.toString() + "\n" + engine.toString();
    }

    public void drive(){
        if (isDrive){
            System.out.println("This car is going now");
            return;
        }
        engine.start();
        isDrive = true;
        System.out.println(" car is driving");
    }

    public void stop(){
        if (!isDrive){
            System.out.println("the car is already");
        }
        engine.stop();
        isDrive = false;
        System.out.println(" car stopped");
    }
}
