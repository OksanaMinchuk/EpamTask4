package by.epam.javatr.minchuk.task04.model.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence extends TextItem {

    private List<TextItem> lexemes;

    public Sentence() {
        super(TextItemType.SENTENCE);
        lexemes = new ArrayList<>();
    }

    public Sentence(List<TextItem> lexemes) {
        super(TextItemType.SENTENCE);
        this.lexemes = lexemes;
    }

    public Sentence(TextItemType textItemType, List<TextItem> lexemes) {
        super(textItemType);
        this.lexemes = lexemes;
    }

    @Override
    public List<TextItem> getChild() {
        return lexemes;
    }

    @Override
    public String getContent() {
        StringBuilder builder = new StringBuilder();
        for (TextItem lexeme : lexemes) {
            builder.append(lexeme.getContent()).append(" ");
        }
        builder.delete(builder.length() - 1, builder.length());
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return lexemes.equals(sentence.lexemes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lexemes);
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "lexemes=" + lexemes +
                '}';
    }
}
