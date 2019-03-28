package by.epam.javatr.minchuk.task04.model.entity;

import java.util.Objects;

/**
 * Class {@code PunctuationSign}
 *
 * @autor Oksana Minchuk
 * @version 1.0 23.03.2019
 */
public class PunctuationSign extends TextItem {

    private String value;

    /**
     * Default constructor
     */
    public PunctuationSign() {
        super(TextItemType.PUNKTUATION);
    }

    /**
     * Constructor
     *
     * @param value
     */
    public PunctuationSign(String value) {
        super(TextItemType.PUNKTUATION);
        if (value != null) {
            this.value = value;
        }
    }

    /**
     * Copy constructor
     *
     * @param punctuationSign
     */
    public PunctuationSign(PunctuationSign punctuationSign) {
        super(TextItemType.PUNKTUATION);
        if (punctuationSign != null) {
            this.value = punctuationSign.value;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PunctuationSign that = (PunctuationSign) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return value;
    }
}
