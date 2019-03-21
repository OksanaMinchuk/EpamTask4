package by.epam.javatr.minchuk.task04.model.parser;

import by.epam.javatr.minchuk.task04.model.entity.TextItem;

import java.util.List;

public abstract class AbstractParser {

    protected  AbstractParser nextParser;
    private static TextItem.TextItemType textItemType;

    public static TextItem.TextItemType getTextItemType() {
        return textItemType;
    }

    public AbstractParser setNextParser(AbstractParser nextParser) {
        this.nextParser = nextParser;
        return nextParser;
    }

    public abstract TextItem parse (String text) ;

}
