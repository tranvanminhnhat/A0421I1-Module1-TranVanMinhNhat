package l19_string_and_regex.exercise.validate_so_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberRegex {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String REGEX_PHONE_NUMBER = "^(\\d{2}-0\\d{9})$";

    public PhoneNumberRegex(){
        pattern = Pattern.compile(REGEX_PHONE_NUMBER);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
