package by.epam.javatr.minchuk.task04.model.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text extends TextItem {

    private List<TextItem> paragraphs;

    public Text() {
        super(TextItemType.TEXT);
        paragraphs = new ArrayList<>();
    }

    public Text(List<TextItem> paragraphs) {
        super(TextItemType.TEXT);
        this.paragraphs = paragraphs;
    }

    @Override
    public List<TextItem> getChild() {
        return paragraphs;
    }

    @Override
    public String getContent() {
        StringBuilder builder = new StringBuilder();
        for (TextItem paragraph : paragraphs) {
            builder.append(paragraph).append("\n");
        }
        builder.delete(builder.length()-1, builder.length());
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return paragraphs.equals(text.paragraphs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paragraphs);
    }

    @Override
    public String toString() {
        return "Text{" +
                "paragraphs=" + paragraphs +
                '}';
    }
}
