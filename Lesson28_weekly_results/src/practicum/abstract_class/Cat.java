package practicum.abstract_class;

public class Cat extends Pet{
    private String name;
    private String bread;
    private String color;

    public Cat(String kind, int age, double weight, boolean gender, String name, String bread, String color) {
        super(kind, age, weight, gender);
        this.name = name;
        this.bread = bread;
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("Ich brauche ein Milch");
    }

    @Override
    public void go() {
        System.out.println("Ich renne nicht");
    }

    @Override
    public void voice() {
        System.out.println("May");
    }
}
