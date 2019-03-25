package by.epam.javatr.minchuk.task04.model.logic.creator;

import by.epam.javatr.minchuk.task04.model.entity.TextItem;
import by.epam.javatr.minchuk.task04.model.exception.TextNullPointerException;
import by.epam.javatr.minchuk.task04.model.exception.TextUnsupportedOperationException;

import java.util.List;

/**
 * Class {@code ParagraphsCreator}
 *
 * @autor Oksana Minchuk
 * @version 1.0 23.03.2019
 */

public class ParagraphsCreator {

    public static List<TextItem> createParagraphList(TextItem resultText) throws TextNullPointerException {
        if (resultText != null) {
            List<TextItem> resultParagraphs = null;
                try {
                    resultParagraphs = resultText.getChild();
                } catch (TextUnsupportedOperationException e) {
                    e.printStackTrace();
                }
            return resultParagraphs;
        }
        throw new TextNullPointerException();
    }
}
