package by.epam.javatr.minchuk.task04.model.entity;

import by.epam.javatr.minchuk.task04.model.exception.TextUnsupportedOperationException;

import java.util.List;

/**
 * Class {@code AbstractComponent} is a superclass all other text components.
 *
 * If the object of subclass does not support operations, it can use the standard behavior:
 * the default implementation initializes
 * @throws TextUnsupportedOperationException
 *
 * @autor Oksana Minchuk
 * @version 1.0 23.03.2019
 */

public abstract class AbstractComponent {

    public List<TextItem> getChild() throws TextUnsupportedOperationException {
        throw new TextUnsupportedOperationException();
    }

    public void addItem(TextItem textItem) throws TextUnsupportedOperationException {
        throw new TextUnsupportedOperationException();
    }

    public void removeItem(TextItem textItem) throws TextUnsupportedOperationException {
        throw new TextUnsupportedOperationException();
    }

    public abstract String toString();

}
