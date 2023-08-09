package practicum;

public class constructor_demo {
    public static void main(String[] args) {

        Person person1 = new Person("Jack", "Johnson","123-123-123", new MyDate(1,2,2000));
        System.out.println(person1);
        Account account1 = new Account("DE1234567",5000000, person1);
        System.out.println(account1);


//        System.out.println(account1.owner.toString());
//        System.out.println(account1.owner.birthday.toString());
//        MyDate birthday = account1.owner.birthday;
    }
}
