package l1111_demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BirthdayRegex {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String BIRTHDAY_REGEX = "^(\\d{4}-\\d{2}-\\d{2})$";

    public BirthdayRegex(){
        pattern = Pattern.compile(BIRTHDAY_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
