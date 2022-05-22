package main.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Arguments {
    int result = 0;
    Matcher matcher;
    Pattern pattern;
    public int sumArguments(String expression) {
        pattern = Pattern.compile("(\\d+)");
        matcher = pattern.matcher(expression);
        while (matcher.find()) {
            result = result + (Integer.parseInt(matcher.group()));
        }
        return result;
    }
}
