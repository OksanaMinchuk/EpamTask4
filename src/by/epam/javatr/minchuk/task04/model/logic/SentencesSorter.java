package by.epam.javatr.minchuk.task04.model.logic;

import by.epam.javatr.minchuk.task04.model.entity.TextItem;
import by.epam.javatr.minchuk.task04.model.exception.TextNullPointerException;
import by.epam.javatr.minchuk.task04.model.exception.TextUnsupportedOperationException;
import by.epam.javatr.minchuk.task04.model.logic.comparator.SentenceComparator;
import by.epam.javatr.minchuk.task04.model.logic.creator.SentencesCreator;

import java.util.List;

public class SentencesSorter {
    public static List<TextItem> sortIncrease(TextItem resultText) {
        List<TextItem> sentences = null;
        try {
            sentences = SentencesCreator.createSentecesList(resultText);
            sentences.sort(new SentenceComparator());
        } catch (TextNullPointerException e) {
            e.printStackTrace();
        } catch (TextUnsupportedOperationException e) {
            e.printStackTrace();
        }
        return sentences;
    }

    public static List<TextItem> sortDecrease(TextItem resultText) {
        List<TextItem> sentences = null;
        try {
            sentences = SentencesCreator.createSentecesList(resultText);
            sentences.sort(new SentenceComparator().reversed());
        } catch (TextNullPointerException e) {
            e.printStackTrace();
        } catch (TextUnsupportedOperationException e) {
            e.printStackTrace();
        }
        return sentences;
    }
}
