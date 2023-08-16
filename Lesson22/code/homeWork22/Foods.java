package homeWork22;

public class Foods extends Product {
    /*
    при покупке продуктов должна появиться дополнительная цена за срочность доставки
     */

    public Foods(String title, double price) {
        super(title, price);
    }

    public double buy() {
        return super.getPrice() + priceForUrgency();
    }

    private double priceForUrgency() {
        return (getPrice() / 100) * 5;

    }

    public String toString() {
        return super.title + "\nProduct Id: " + super.getId() + "\nDelivery " +
                priceForUrgency() + "\nprice: " + buy() + " euro" + "\n------------------\n";
    }
}
