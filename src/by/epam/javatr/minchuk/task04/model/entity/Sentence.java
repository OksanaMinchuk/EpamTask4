package by.epam.javatr.minchuk.task04.model.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence extends TextItem {

    private List<TextItem> lexemes;

    /**
     * Default constructor
     */
    public Sentence() {
        super(TextItemType.SENTENCE);
        this.lexemes = new ArrayList<>();
    }

    /**
     * Constructor
     *
     * @param lexemes
     */
    public Sentence(List<TextItem> lexemes) {
        super(TextItemType.SENTENCE);
        this.lexemes = lexemes;
    }

    /**
     * Copy constructor
     *
     * @param sentence
     */
    public Sentence(Sentence sentence) {
        super(TextItemType.SENTENCE);
        this.lexemes = new ArrayList<>();
        for (int i = 0; i < sentence.lexemes.size(); i++) {
            this.lexemes.add(sentence.lexemes.get(i));
        }
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
    public void addItem(TextItem textItem) {
        lexemes.add(textItem);
    }

    @Override
    public void removeItem(TextItem textItem) {
        lexemes.remove(textItem);
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
