package homeWork22;

public class Electronics extends Product {

    /*
    при покупке электроники, покупателю оформляют гарантию
    (т.е. при покупке должен выполнятся метод “Оформить гарантию”)
     */
    public Electronics(String title, double price) {
        super(title, price);
    }

    private String issueGuarantee(){
        return "When buying a " + super.title + ", you need to issue a guarantee";
    }

    public String toString() {
        return super.title + "\nProduct Id: " + super.getId() + "\nprice: " + buy() + " euro" + "\n"
                + issueGuarantee() + "\n------------------\n";
    }
}
