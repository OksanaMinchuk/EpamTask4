package by.epam.javatr.minchuk.task04.model.entity;

import java.util.Objects;

public class Lexeme extends TextItem {

    private String value;

    public Lexeme() {
        super(TextItemType.LEXEME);
    }

    public Lexeme(String value) {
        super(TextItemType.LEXEME);
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
        Lexeme lexeme = (Lexeme) o;
        return value.equals(lexeme.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Lexeme{" +
                "value='" + value + '\'' +
                '}';
    }
}
