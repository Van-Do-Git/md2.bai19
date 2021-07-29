package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClassName {
    private static final String NAMEREGEX = "^[C|A|P]+[0-9]{4}[G|H|I|K|L|M]";
    public RegexClassName(){
    }
    public boolean validate(String name){
        Pattern pattern = Pattern.compile(NAMEREGEX);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static void main(String[] args) {
        RegexClassName regexClassName = new RegexClassName();
        System.out.println(regexClassName.validate("C0318G"));
        System.out.println(regexClassName.validate("M0318G"));
        System.out.println(regexClassName.validate("P0323A"));
    }
}
