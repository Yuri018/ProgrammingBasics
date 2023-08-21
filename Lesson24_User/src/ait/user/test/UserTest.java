package ait.user.test;

import ait.user.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user;
    private String email = "john@gmail.com";
    private String password = "1234";

    @BeforeEach
    void setUp() {
        user = new User(email, password);
    }

    @Test
    void testEmailDoubleAt(){
        String invalidEmail = "jo@hn@gmail.com";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailNotAt(){
        String invalidEmail = "john.gmail.com";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }
}