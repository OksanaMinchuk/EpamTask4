package by.epam.javatr.minchuk.task04.model.entity;

import by.epam.javatr.minchuk.task04.model.exception.TextUnsupportedOperationException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
        this.sentences = sentences;
    }

    /**
     * Copy constructor
     *
     * @param paragraph
     */
    public Paragraph(Paragraph paragraph) {
        super(TextItemType.PARAGRAPH);
        this.sentences = new ArrayList<>();
        for (int i = 0; i < paragraph.sentences.size(); i++) {
            this.sentences.add(paragraph.sentences.get(i));
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
    public String getContent() {
        StringBuilder builder = new StringBuilder();
        builder.append("\t");
        for (TextItem sentence : sentences) {
            builder.append(sentence.getContent()).append(" ");
        }
        builder.delete(builder.length() - 1, builder.length());
        return builder.toString();
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
        return "Paragraph{" +
                "sentences=" + sentences +
                '}';
    }
}
