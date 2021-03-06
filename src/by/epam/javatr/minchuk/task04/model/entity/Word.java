package by.epam.javatr.minchuk.task04.model.entity;

import java.util.Objects;

/**
 * Class {@code Word}
 *
 * @autor Oksana Minchuk
 * @version 1.0 23.03.2019
 */

public class Word extends TextItem {

    private String value;

    /**
     * Default constructor
     */
    public Word() {
        super(TextItemType.WORD);
    }

    /**
     * Constructor
     *
     * @param value
     */
    public Word(String value) {
        super(TextItemType.WORD);
        if (value != null) {
            this.value = value;
        }
    }

    /**
     * Copy constructor
     *
     * @param word
     */
    public Word(Word word) {
        super(TextItemType.WORD);
        if (word != null) {
            this.value = word.value;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return value.equals(word.value);
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
