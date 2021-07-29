package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPhoneNumber {
    private static final String NAMEREGEX = "[(]+[0-9]{2}[)]+[-]+[(][0-9]{10}[)]+";

    public RegexPhoneNumber() {
    }

    public boolean validate(String name) {
        Pattern pattern = Pattern.compile(NAMEREGEX);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static void main(String[] args) {
        RegexPhoneNumber regexPhoneNumber = new RegexPhoneNumber();
        System.out.println(regexPhoneNumber.validate("(84)-(0978489648)"));
        System.out.println(regexPhoneNumber.validate("(a8)-(22222222)"));
    }
}
