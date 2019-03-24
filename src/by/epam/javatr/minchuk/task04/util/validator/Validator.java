package by.epam.javatr.minchuk.task04.util.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    private static final String PARAGRAPH_PATTERN = "^([A-Z]|[-])(.+)([\\w]|[.]|[?!:;])$";
    //private static final String WORD_PATTERN = "[A-Za-z]";
    private static final String WORD_PATTERN = "([\\w]+)|(^([\\w])([.?!:;])$)";

    public static boolean isValidParagraph (String paragraph) {
        Pattern pattern = Pattern.compile(PARAGRAPH_PATTERN);
        Matcher matcher = pattern.matcher(paragraph);
        return matcher.matches();
    }

    public static boolean isWord (String paragraph) {
        Pattern pattern = Pattern.compile(PARAGRAPH_PATTERN);
        Matcher matcher = pattern.matcher(paragraph);
        return matcher.matches();
    }
}
