package l19_string_and_regex.exercise.validate_ten_lop_hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameRegex {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String REGEX_CLASS_NAME = "^([ACP]\\d{4}[GHIKLM])$";

    public ClassNameRegex(){
        pattern = Pattern.compile(REGEX_CLASS_NAME);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
