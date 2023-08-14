package onlineStore;

public class Product2 {
    private String name;
    private double prise;
    private double weight;
    private String color;

    public double getPrise() {
        return prise;
    }

    public String getName() {
        return name;
    }

    public Product2(String name, double prise, double weight, String color) {
        this.name = name;
        this.prise = prise;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return name + "\nprise: " + prise + " euro" + "\nweight: " + weight + " gram" +
                "\ncolor: " + color + "\n";
    }
}
