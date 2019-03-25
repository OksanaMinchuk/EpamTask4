package by.epam.javatr.minchuk.task04.model.parser;

import by.epam.javatr.minchuk.task04.model.entity.PunctuationSign;
import by.epam.javatr.minchuk.task04.model.entity.Sentence;
import by.epam.javatr.minchuk.task04.model.entity.TextItem;
import by.epam.javatr.minchuk.task04.model.entity.Word;
import by.epam.javatr.minchuk.task04.model.exception.TextNullPointerException;
import by.epam.javatr.minchuk.task04.model.exception.TextUnsupportedOperationException;
import by.epam.javatr.minchuk.task04.util.validator.Validator;
import org.apache.log4j.Logger;

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

    private static final String LEXEMES_SEPARATOR_REGEX = " ?(?<!\\G)((?<=[^\\p{Punct}])(?=\\p{Punct})|\\b) ?";

    /**
     * Returns sentence (a container of words and punctuation signs)
     *
     * @param text
     * @return parseSentense
     */
    @Override
    public TextItem parse(String text) throws TextNullPointerException {
        if (text != null) {
            LOGGER.info("   start sentence parsing");
            String[] lexemeString = text.split(LEXEMES_SEPARATOR_REGEX);

            TextItem parseSentense = new Sentence();
            for (int i = 0; i < lexemeString.length; i++) {
                try {
                    if (Validator.isWord(lexemeString[i])) {
                        parseSentense.addItem(new Word(lexemeString[i]));
                        LOGGER.info("   add word " + lexemeString[i]);
                    } else {
                        parseSentense.addItem(new PunctuationSign(lexemeString[i]));
                        LOGGER.info("   add punctuation sign " + lexemeString[i]);
                    }
                } catch (TextUnsupportedOperationException e) {
                    e.printStackTrace();
                }
            }
            LOGGER.info("   end sentence parsing");
            return parseSentense;
        }
        throw new TextNullPointerException();
    }
}
