package by.epam.javatr.minchuk.task04.model.parser;

import by.epam.javatr.minchuk.task04.model.entity.Lexeme;
import by.epam.javatr.minchuk.task04.model.entity.Sentence;
import by.epam.javatr.minchuk.task04.model.entity.TextItem;
import by.epam.javatr.minchuk.task04.model.exception.TextNullPointerException;
import by.epam.javatr.minchuk.task04.model.exception.TextUnsupportedOperationException;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Class {@code SentenceParser}
 *
 * @autor Oksana Minchuk
 * @version 1.0 23.03.2019
 */

public class SentenceParser extends AbstractParser {

    private static final Logger LOGGER;

    static {
        LOGGER = Logger.getRootLogger();
    }

    private static final String LEXEMES_SEPARATOR_REGEX = "(?<=[.!?]\\s)";
    //private AbstractParser nextParser = new LexemeParser();

    /**
     * Returns sentence (a container object of lexems, where lexema is character set and punctuation marks)
     *
     * @param text
     * @return parseSentense
     */
    @Override
    public TextItem parse(String text) throws TextNullPointerException {
        if (text != null) {
            LOGGER.info("   start sentence parsing");
            String[] lexemeString = text.split(LEXEMES_SEPARATOR_REGEX);
           // List<TextItem> lexemesList = new ArrayList<>();

            TextItem parseSentense = new Sentence();
            for (int i = 0; i < lexemeString.length; i++) {
                try {
                    parseSentense.addItem(new Lexeme(lexemeString[i]));
                } catch (TextUnsupportedOperationException e) {
                    e.printStackTrace();
                }
               // lexemesList.add(nextParser.parse(lexemeString[i]));
            }
            LOGGER.info("   end sentence parsing");
            return parseSentense;
        }
        throw new TextNullPointerException();
    }
}
