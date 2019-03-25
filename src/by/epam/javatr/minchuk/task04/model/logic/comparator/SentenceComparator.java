package by.epam.javatr.minchuk.task04.model.logic.comparator;

import by.epam.javatr.minchuk.task04.model.entity.TextItem;

import java.util.Comparator;

public class SentenceComparator implements Comparator<TextItem> {

    @Override
    public int compare(TextItem textItem, TextItem t1) {
        return textItem.getContent().length() - t1.getContent().length();
    }
}
