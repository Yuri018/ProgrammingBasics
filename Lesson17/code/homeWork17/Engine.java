package homeWork17;

public class Engine {
    int enginePower;
    String engineType;

    public Engine(int enginePower, String engineType){
        this.enginePower = enginePower;
        this.engineType = engineType;
    }

    public String toString() {
        return "enginePower = " + enginePower + "\nengineType = " + engineType;
    }

    public void start(){
        System.out.print("Engine is started");
    }

    public void stop(){
        System.out.print("Engine is stopped");
    }
}
