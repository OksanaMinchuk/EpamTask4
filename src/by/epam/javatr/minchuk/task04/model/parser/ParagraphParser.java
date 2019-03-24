package by.epam.javatr.minchuk.task04.model.parser;

import by.epam.javatr.minchuk.task04.model.entity.Paragraph;
import by.epam.javatr.minchuk.task04.model.entity.TextItem;
import by.epam.javatr.minchuk.task04.model.exception.TextNullPointerException;
import by.epam.javatr.minchuk.task04.model.exception.TextUnsupportedOperationException;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Class {@code ParagraphParser}
 *
 * @autor Oksana Minchuk
 * @version 1.0 23.03.2019
 */

public class ParagraphParser extends AbstractParser {

    private static final Logger LOGGER;

    static {
        LOGGER = Logger.getRootLogger();
    }

    private static final String PARAGRAPH_SEPARATOR_REGEX = "[\\.\\!\\?]";
    private AbstractParser nextParser = new SentenceParser();

    /**
     * Returns paragrah (a container object of sentences)
     *
     * @param text
     * @return parseParagraph
     */
    @Override
    public TextItem parse(String text) throws TextNullPointerException {
        if (text != null) {
            LOGGER.info("- start paragraph parsing");
            String[] sentenceString = text.split(PARAGRAPH_SEPARATOR_REGEX);

            TextItem parseParagraph = new Paragraph();
            for (int i = 0; i < sentenceString.length; i++) {
                try {
                    parseParagraph.addItem(nextParser.parse(sentenceString[i]));
                } catch (TextUnsupportedOperationException e) {
                    e.printStackTrace();
                }
            }
            LOGGER.info("- end paragraph parsing");
            return parseParagraph;
        }
        throw new TextNullPointerException();
    }

}
