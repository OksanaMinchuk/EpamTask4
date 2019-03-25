package by.epam.javatr.minchuk.task04.model.logic.creator;

import by.epam.javatr.minchuk.task04.model.entity.Paragraph;
import by.epam.javatr.minchuk.task04.model.entity.TextItem;
import by.epam.javatr.minchuk.task04.model.exception.TextNullPointerException;
import by.epam.javatr.minchuk.task04.model.exception.TextUnsupportedOperationException;
import by.epam.javatr.minchuk.task04.model.logic.creator.ParagraphsCreator;

import java.util.ArrayList;
import java.util.List;

/**
 * Class {@code SentencesCreator}
 *
 * @autor Oksana Minchuk
 * @version 1.0 23.03.2019
 */

public class SentencesCreator {

    public static List<TextItem> createSentecesList(TextItem resultText) throws TextNullPointerException, TextUnsupportedOperationException {
        if (resultText != null) {
            List<TextItem> resultParagraphs = ParagraphsCreator.createParagraphList(resultText);
            List<TextItem> resultSentences = new ArrayList<>();

            for(int i = 0; i < resultParagraphs.size(); i++) {
                if (resultParagraphs.get(i) instanceof Paragraph) {
                    for (int j = 0; j < resultParagraphs.get(i).getChild().size(); j++) {
                        resultSentences.add(resultParagraphs.get(i).getChild().get(j));
                    }
                }
            }
            return resultSentences;
        }
        throw new TextNullPointerException();
    }
}
