package homeWork22;

public class Product {
    private static int counter;
    private int id;
    String title;
    private double price;

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public Product(String title, double price) {
        this.id = counter++;
        this.title = title;
        this.price = price;
    }

    public double buy() {
        return getPrice();
    }

    @Override
    public String toString() {
        return title + "\nProduct Id: " + getId() + "\nprice: " + buy() + " euro" + "\n------------------\n";
    }
}
