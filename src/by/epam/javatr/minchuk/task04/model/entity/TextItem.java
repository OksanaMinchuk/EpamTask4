package by.epam.javatr.minchuk.task04.model.entity;

public class TextItem extends AbstractComponent {

    public enum TextItemType {
        TEXT, PARAGRAPH, SENTENCE, LEXEME, WORD, CODE
    }

    private TextItemType textItemType;

    public TextItem() {
    }

    public TextItem(TextItemType textItemType) {
        this.textItemType = textItemType;
    }

    public TextItemType getTextItemType() {
        return textItemType;
    }

    @Override
    public String getContent() {
        return "textItemType=" + textItemType;
    }
}
