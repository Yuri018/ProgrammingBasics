package practicum.abstract_class;

public class Dog extends Pet{

    private String name;
    private String bread;

    public Dog(String kind, int age, double weight, boolean gender, String name, String bread) {
        super(kind, age, weight, gender);
        this.name = name;
        this.bread = bread;
    }

    @Override
    public void eat() {
        System.out.println("Ich brauche eine Fleich");
    }

    @Override
    public void go() {
        System.out.println("Ich renne");
    }

    @Override
    public void voice() {
        System.out.println("ich belle");
    }
}
