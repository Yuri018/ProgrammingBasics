package practicum;

public class Product {
    private static int counter = 0;
    private int id;
    private String title;
    private double price;

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public Product(String title, double price) {
        this.id = counter++;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product\n" +
                "id = " + id + "\ntitle = " + title + "\nprice = " + price +"\n";
    }
}
