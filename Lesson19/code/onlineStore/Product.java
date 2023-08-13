package onlineStore;

public class Product {
    private String name;
    private double prise;
    private double weight;
    private String color;

    public double getPrise() {
        return prise;
    }

    public Product(String name, double prise, double weight, String color) {
        this.name = name;
        this.prise = prise;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {//TODO поправить вывод
        return "Product{" +
                "name='" + name + '\'' +
                ", prise=" + prise +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}' + "\n";
    }
}
