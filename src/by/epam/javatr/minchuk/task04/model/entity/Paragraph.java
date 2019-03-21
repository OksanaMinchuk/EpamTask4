package by.epam.javatr.minchuk.task04.model.entity;

import java.util.List;
import java.util.Objects;

public class Paragraph extends TextItem {

    private List<TextItem> sentences;

    public Paragraph() {
        super(TextItemType.PARAGRAPH);
    }

    public Paragraph(List<TextItem> sentences) {
        super(TextItemType.PARAGRAPH);
        this.sentences = sentences;
    }

    @Override
    public List<TextItem> getChild() {
        return sentences;
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
