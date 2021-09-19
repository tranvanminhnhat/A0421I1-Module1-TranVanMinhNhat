package l1111_demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FullNameRegex {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String FULL_NAME_REGEX = "^(\\b[A-Z]{1}[a-z]+)( )([A-Z]{1}[a-z]+\\b)$";

    public FullNameRegex(){
        pattern = Pattern.compile(FULL_NAME_REGEX);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
