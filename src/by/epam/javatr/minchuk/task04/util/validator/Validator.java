package by.epam.javatr.minchuk.task04.util.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    private static final String PARAGRAPH_PATTERN = "^([A-Z]|[-])(.+)([\\w]|[.]|[?!:;])$";
    private static final String WORD_PATTERN = "\\w+";

    /**
     *
     * @param paragraph
     * @return true if paragraph is valid text
     */
    public static boolean isValidParagraph (String paragraph) {
        Pattern pattern = Pattern.compile(PARAGRAPH_PATTERN);
        Matcher matcher = pattern.matcher(paragraph);
        return matcher.matches();
    }

    /**
     *
     * @param word
     * @return true if word is valid
     */
    public static boolean isWord (String word) {
        Pattern pattern = Pattern.compile(WORD_PATTERN);
        Matcher matcher = pattern.matcher(word);
        return matcher.matches();
    }
}
