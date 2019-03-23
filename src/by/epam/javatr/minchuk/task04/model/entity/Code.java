package by.epam.javatr.minchuk.task04.model.entity;

import java.util.Objects;

public class Code extends TextItem {

    private static final TextItemType textType = TextItemType.CODE;
    private String value;

    /**
     * Default constructor
     */
    public Code() {
    }

    /**
     * Constructor
     *
     * @param value
     */
    public Code(String value) {
        this.value = value;
    }

    /**
     * Copy constructor
     *
     * @param code
     */
    public Code(Code code) {
        this.value = code.value;
    }


    public static TextItemType getTextType() {
        return textType;
    }

    @Override
    public String getContent() {
        return value;
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
        return "Code{" +
                "value='" + value + '\'' +
                '}';
    }
}
