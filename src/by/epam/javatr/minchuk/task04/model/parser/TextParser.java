package by.epam.javatr.minchuk.task04.model.parser;

import by.epam.javatr.minchuk.task04.model.entity.Code;
import by.epam.javatr.minchuk.task04.model.entity.Text;
import by.epam.javatr.minchuk.task04.model.entity.TextItem;
import by.epam.javatr.minchuk.task04.model.exception.TextNullPointerException;
import by.epam.javatr.minchuk.task04.model.exception.TextUnsupportedOperationException;
import by.epam.javatr.minchuk.task04.util.validator.Validator;
import org.apache.log4j.Logger;


/**
 * Class {@code TextParser}
 *
 * @autor Oksana Minchuk
 * @version 1.0 23.03.2019
 */

public class TextParser extends AbstractParser {

    private static final Logger LOGGER;

    static {
        LOGGER = Logger.getRootLogger();
    }

    private static final String TEXT_SEPARATOR_REGEX = "\n";
    private AbstractParser nextParser = new ParagraphParser();

    /**
     * Returns text (a container object of paragraphs)
     *
     * @param text
     * @return parseText
     */
    @Override
    public TextItem parse(String text) throws TextNullPointerException {
        if (text != null) {
            LOGGER.info("start text parsing");
            String[] paragraphString = text.split(TEXT_SEPARATOR_REGEX);

            TextItem parseText = new Text();
            for (int i = 0; i < paragraphString.length; i++) {
                try {
                    if (Validator.isValidParagraph(paragraphString[i])) {
                    parseText.addItem(nextParser.parse(paragraphString[i]));
                    LOGGER.info("add paragraph to text");
                    } else {
                        parseText.addItem(new Code(paragraphString[i]));
                        LOGGER.info("add code block to text " + paragraphString[i]);
                    }
                } catch (TextUnsupportedOperationException e) {
                    e.printStackTrace();
                }
            }
            LOGGER.info("end text parsing");
            return parseText;
        }
        throw new TextNullPointerException();
    }
}
