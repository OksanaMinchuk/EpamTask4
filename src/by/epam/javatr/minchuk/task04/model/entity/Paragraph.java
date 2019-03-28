package by.epam.javatr.minchuk.task04.model.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Class {@code Paragraph}
 *
 * @autor Oksana Minchuk
 * @version 1.0 23.03.2019
 */

public class Paragraph extends TextItem {

    private List<TextItem> sentences;

    /**
     * Default constructor
     */
    public Paragraph() {
        super(TextItemType.PARAGRAPH);
        this.sentences = new ArrayList<>();
    }

    /**
     * Constructor
     *
     * @param sentences
     */
    public Paragraph(List<TextItem> sentences) {
        super(TextItemType.PARAGRAPH);
        if (sentences != null) {
            this.sentences = sentences;
        }
    }

    /**
     * Copy constructor
     *
     * @param paragraph
     */
    public Paragraph(Paragraph paragraph) {
        super(TextItemType.PARAGRAPH);
        if (paragraph !=null) {
            this.sentences = new ArrayList<>();
            for (int i = 0; i < paragraph.sentences.size(); i++) {
                this.sentences.add(paragraph.sentences.get(i));
            }
        }
    }

    @Override
    public List<TextItem> getChild() {
        return sentences;
    }

    @Override
    public void addItem(TextItem textItem) {
        sentences.add(textItem);
    }

    @Override
    public void removeItem(TextItem textItem) {
        sentences.remove(textItem);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paragraph paragraph = (Paragraph) o;
        return sentences.equals(paragraph.sentences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentences);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (TextItem sentence : sentences) {
            builder.append(sentence.toString());
        }
        return builder.toString();
    }
}
