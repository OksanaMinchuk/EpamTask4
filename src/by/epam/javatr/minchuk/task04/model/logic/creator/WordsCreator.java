package by.epam.javatr.minchuk.task04.model.logic.creator;

import by.epam.javatr.minchuk.task04.model.entity.TextItem;
import by.epam.javatr.minchuk.task04.model.entity.Word;
import by.epam.javatr.minchuk.task04.model.exception.TextNullPointerException;
import by.epam.javatr.minchuk.task04.model.exception.TextUnsupportedOperationException;

import java.util.ArrayList;
import java.util.List;

/**
 * Class {@code WordsCreator}
 *
 * @autor Oksana Minchuk
 * @version 1.0 23.03.2019
 */

public class WordsCreator {
    public static List<TextItem> createWordsList(TextItem resultText) throws TextNullPointerException, TextUnsupportedOperationException {
        if (resultText != null) {
            List<TextItem> resultSentences = SentencesCreator.createSentecesList(resultText);
            List<TextItem> resultWords = new ArrayList<>();
            for (int i = 0; i < resultSentences.size(); i++) {
                for (int j = 0; j < resultSentences.get(i).getChild().size(); j++) {
                    if (resultSentences.get(i).getChild().get(j) instanceof Word) {
                        resultWords.add(resultSentences.get(i).getChild().get(j));
                    }
                }
            }
            return resultWords;
        }
        throw new TextNullPointerException();
    }
}
