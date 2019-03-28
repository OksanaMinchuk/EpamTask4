package by.epam.javatr.minchuk.task04.model.entity;

import java.util.Objects;

/**
 * Class {@code Code}
 *
 * @autor Oksana Minchuk
 * @version 1.0 23.03.2019
 */

public class Code extends TextItem {

    //private static final TextItemType textType = TextItemType.CODE;
    private String value;

    /**
     * Default constructor
     */
    public Code() {
        super(TextItemType.CODE);
    }

    /**
     * Constructor
     *
     * @param value
     */
    public Code(String value) {
        super(TextItemType.CODE);
        if (value != null) {
            this.value = value;
        }
    }

    /**
     * Copy constructor
     *
     * @param code
     */
    public Code(Code code) {
        super(TextItemType.CODE);
        if (code != null) {
            this.value = code.value;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Code code = (Code) o;
        return value.equals(code.value);
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
