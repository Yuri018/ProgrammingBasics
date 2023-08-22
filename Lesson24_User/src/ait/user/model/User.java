package ait.user.model;

public class User {
    private String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (emailIsValid(email)) {
            this.email = email;
        } else {
            System.out.println(email + " is not valid");
        }
    }

    /*
    1. '@' - exist and only one
    2. '.' - min one dot after @
    3. min two symbols after last dot
    4. alphabetic, digits, '@', '.', '_', '-'
     */
    private boolean emailIsValid(String email) {
        int at = email.indexOf('@');
        //if (at == -1 || email.indexOf('@', at + 1) != 1)
        if (at == -1 || email.lastIndexOf('@') != at) {
            return false;
        }
        if (email.indexOf('.', at + 1) == -1) {
            return false;
        }
        if (email.lastIndexOf('.') >= email.length() - 2) {
            return false;
        }
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if (!(Character.isDigit(c) || Character.isAlphabetic(c) || c == '@' || c == '.' || c == '_' || c == '-')) {
                return false;
            }
        }
        return true;
    }

    public String getPassword() {
        return password;
    }

    /*
  TODO Homework
  1) Min 8 symbols
  2) Min one symbol in uppercase
  3) Min one symbol in lowercase
  4) Min one symbol is digit
  5) Min one symbol is a special symbol (!%@*&)
   */
    public void setPassword(String password) {
        if (passwordIsValid(password)) {
            this.password = password;
        } else {
            System.out.println(password + " is not valid");
        }

    }

    private boolean passwordIsValid(String password) {
        int a = 0, b = 0, c = 0, d = 0;

        if (password.length() < 8) {
            return false;
        }
        for (char ch : password.toCharArray()) {

            if (Character.isUpperCase(ch)) {
                a++;
            }
            if (Character.isLowerCase(ch)) {
                b++;
            }
            if (Character.isDigit(ch)) {
                c++;
            }
            if (ch == '!' || ch == '%' || ch == '@' || ch == '*' || ch == '&') {
                d++;
            }
        }
        return a != 0 && b != 0 && c != 0 && d != 0;
    }
    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
