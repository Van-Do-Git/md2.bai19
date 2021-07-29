package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    String regex;
    boolean validate;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public Regex(String regex) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(regex);
        validate = matcher.matches();
    }

}

class EmailExampleTest {
    private static Regex emailExample;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String args[]) {
        for (String email : validEmail) {
            boolean isvalid = new Regex(email).validate;
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = new Regex(email).validate;
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
    }
}
