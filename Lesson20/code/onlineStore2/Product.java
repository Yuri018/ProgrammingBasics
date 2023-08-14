package onlineStore2;

public class Product {

    private static int counter;
    private int id;
    private String name;
    private double prise;
    private double weight;

    public double getPrise() {
        return prise;
    }

    public int getId() {
        return id;
    }

    public Product(String name, double prise, double weight) {
        this.id = counter++;
        this.name = name;
        this.prise = prise;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + "\nProduct Id: " + getId() + "\nprise: " + prise + " euro" +
                "\nweight: " + weight + " gram" + "\n";
    }
}
