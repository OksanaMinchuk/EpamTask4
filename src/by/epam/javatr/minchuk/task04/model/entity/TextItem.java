package by.epam.javatr.minchuk.task04.model.entity;

/**
 * Class {@code TextItem} is a superclass for other text components:
 * TEXT, PARAGRAPH, SENTENCE, WORD, PUNCTUATION SIGN, CODE.
 *
 * @autor Oksana Minchuk
 * @version 1.0 23.03.2019
 */

public class TextItem extends AbstractComponent {

    public enum TextItemType {
        TEXT, PARAGRAPH, SENTENCE, WORD, CODE, PUNKTUATION
    }

    private TextItemType textItemType;

    /**
     * Default constructor
     */
    public TextItem() {
    }

    /**
     * Constructor
     *
     * @param textItemType
     */
    public TextItem(TextItemType textItemType) {
        this.textItemType = textItemType;
    }

    public TextItemType getTextItemType() {
        return textItemType;
    }

    @Override
    public String toString() {
        return textItemType.toString();
    }
}
