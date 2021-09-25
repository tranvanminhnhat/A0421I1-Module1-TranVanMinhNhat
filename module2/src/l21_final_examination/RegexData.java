package l21_final_examination;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexData {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String REGEX_NUMBER = "[0-9]{20}";

    public RegexData(){
        pattern = Pattern.compile(REGEX_NUMBER);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
