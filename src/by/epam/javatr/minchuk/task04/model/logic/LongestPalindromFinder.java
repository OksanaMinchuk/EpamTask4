package by.epam.javatr.minchuk.task04.model.logic;

import by.epam.javatr.minchuk.task04.model.entity.TextItem;
import by.epam.javatr.minchuk.task04.model.entity.Word;
import by.epam.javatr.minchuk.task04.model.exception.TextNullPointerException;
import by.epam.javatr.minchuk.task04.model.exception.TextUnsupportedOperationException;
import by.epam.javatr.minchuk.task04.model.logic.creator.WordsCreator;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Stack;

public class LongestPalindromFinder {

    private static final Logger LOGGER;

    static {
        LOGGER = Logger.getRootLogger();
    }

    public static String findLongestPolindrom (TextItem resultText) throws TextNullPointerException, TextUnsupportedOperationException {
        if (resultText != null) {
            List<TextItem> words = WordsCreator.createWordsList(resultText);
            TextItem longestPolindrom = new Word("");
            for (int i = 0; i < words.size(); i++) {
                if (isPolindrom(words.get(i).toString())) {
                    if (words.get(i).toString().length() > longestPolindrom.toString().length()) {
                        longestPolindrom = new Word((Word) words.get(i));
                    }
                }
            }
            return longestPolindrom.toString();
        }
        throw new TextNullPointerException();
    }

    private static boolean isPolindrom(String string) {
        int count = string.length()/2;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < count; i++) {
            stack.push(string.charAt(i));
        }
        if (string.length()%2 != 0) {
            count++;
        }
        for (int i = count; i < string.length(); i++) {
            char ch = stack.pop();
            if (ch != string.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
