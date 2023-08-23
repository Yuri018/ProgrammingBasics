package homeWork25.test;


import homeWork25.model.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("john@gmail.com", "1234");
        System.out.println(user);
        user.setEmail("@john@gmail.com.");
        System.out.println(user);
        user.setPassword("1*&%!Aaaaa");
        System.out.println(user);
    }
}
