package by.epam.javatr.minchuk.task04.model.parser;

import by.epam.javatr.minchuk.task04.model.entity.TextItem;

import java.util.ArrayList;
import java.util.List;

public class CodeParser extends AbstractParser {

    private List<String> keyWords;

    @Override
    public TextItem parse(String text) {
        keyWords = new ArrayList<>();
        keyWords.add("Character");
        keyWords.add("List");
        keyWords.add("for");
        keyWords.add("public");
        keyWords.add("import");




        return null;
    }
}
