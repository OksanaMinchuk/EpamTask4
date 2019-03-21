package by.epam.javatr.minchuk.task04.model.entity;

import by.epam.javatr.minchuk.task04.model.exception.TextUnsupportedOperationException;

import java.util.List;

public abstract class AbstractComponent {

    public List<TextItem> getChild() throws TextUnsupportedOperationException {
        throw new TextUnsupportedOperationException();
    }

    public abstract String getContent();

}
