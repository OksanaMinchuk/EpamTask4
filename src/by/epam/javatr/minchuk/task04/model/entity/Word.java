package by.epam.javatr.minchuk.task04.model.entity;

import java.util.Objects;

public class Word extends TextItem {

    private String value;

    public Word() {
        super(TextItemType.WORD);
    }

    public Word(String value) {
        super(TextItemType.WORD);
        this.value = value;
    }

    @Override
    public String getContent() {
        return value;
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
        return "Word{" +
                "value='" + value + '\'' +
                '}';
    }
}
