package by.epam.javatr.minchuk.task04.model.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Class {@code Text}
 *
 * @autor Oksana Minchuk
 * @version 1.0 23.03.2019
 */
public class Text extends TextItem {

    private List<TextItem> paragraphs;

    /**
     * Default constructor
     */
    public Text() {
        super(TextItemType.TEXT);
        this.paragraphs = new ArrayList<>();
    }

    /**
     * Constructor
     *
     * @param paragraphs
     */
    public Text(List<TextItem> paragraphs) {
        super(TextItemType.TEXT);
        if (paragraphs != null) {
            this.paragraphs = paragraphs;
        }
    }

    /**
     * Copy constructor
     *
     * @param text
     */
    public Text(Text text) {
        super(TextItemType.TEXT);
        if (text != null) {
            this.paragraphs = new ArrayList<>();
            for (int i = 0; i < text.paragraphs.size(); i++) {
                this.paragraphs.add(text.paragraphs.get(i));
            }
        }
    }

    @Override
    public List<TextItem> getChild() {
        return paragraphs;
    }

    @Override
    public void addItem(TextItem textItem) {
        paragraphs.add(textItem);
    }

    @Override
    public void removeItem(TextItem textItem) {
        paragraphs.remove(textItem);
    }

    @Override
    public String getContent() {
        StringBuilder builder = new StringBuilder();
        for (TextItem paragraph : paragraphs) {
            //builder.append("\t");
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
        StringBuilder builder = new StringBuilder();
        for (TextItem paragraph : paragraphs) {
            builder.append(paragraph.getContent()).append("\n");
        }
        return builder.toString();
    }
}
