package by.epam.javatr.minchuk.task04.model.parser;

import by.epam.javatr.minchuk.task04.model.entity.*;
import by.epam.javatr.minchuk.task04.model.exception.TextNullPointerException;
import by.epam.javatr.minchuk.task04.model.exception.TextUnsupportedOperationException;
import by.epam.javatr.minchuk.task04.model.parser.ChainParser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Oksana Minchuk
 * @version 1.0 26.03.2019
 */

public class TextParserTest {

    private String string;
    private TextItem expectedText;

    @Before
    public void init() throws TextUnsupportedOperationException {
        string = "Java can reduce costs, drive innovation, and improve application services.";
        TextItem word1 = new Word("Java");
        TextItem word2 = new Word("can");
        TextItem word3 = new Word("reduce");
        TextItem word4 = new Word("costs");
        TextItem word5 = new Word("drive");
        TextItem word6 = new Word("innovation");
        TextItem word7 = new Word("and");
        TextItem word8 = new Word("improve");
        TextItem word9 = new Word("application");
        TextItem word10 = new Word("services");
        TextItem point = new PunctuationSign(".");
        TextItem comma = new PunctuationSign(",");

        Sentence sentence = new Sentence();
        sentence.addItem(word1);
        sentence.addItem(word2);
        sentence.addItem(word3);
        sentence.addItem(word4);
        sentence.addItem(comma);
        sentence.addItem(word5);
        sentence.addItem(word6);
        sentence.addItem(comma);
        sentence.addItem(word7);
        sentence.addItem(word8);
        sentence.addItem(word9);
        sentence.addItem(word10);
        sentence.addItem(point);

        TextItem paragraph = new Paragraph();
        paragraph.addItem(sentence);

        expectedText = new Text();
        expectedText.addItem(paragraph);
    }

    @Test
    public void testParse() throws TextNullPointerException {
        TextItem actualText = ChainParser.getChainParser().parse(string);
        Assert.assertEquals(expectedText, actualText);
    }
}
