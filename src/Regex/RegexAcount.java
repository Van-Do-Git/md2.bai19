package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAcount {
    public RegexAcount() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile("^[_a-z0-9]{6,}$");
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

class TestRegexAcount {
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        RegexAcount regexAcount = new RegexAcount();
        for(String string: validAccount){
            System.out.println(regexAcount.validate(string));
        }
        for(String string: invalidAccount){
            System.out.println(regexAcount.validate(string));
        }
    }
}
