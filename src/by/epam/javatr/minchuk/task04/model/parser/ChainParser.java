package by.epam.javatr.minchuk.task04.model.parser;

/**
 * Class {@code ChainParser}
 *
 * @autor Oksana Minchuk
 * @version 1.0 23.03.2019
 */

public class ChainParser {

    public static AbstractParser getChainParser() {

        AbstractParser textParser = new TextParser();
        AbstractParser paragraphParser = new ParagraphParser();
        AbstractParser sentenceParser = new SentenceParser();
        //AbstractParser lexemeParser = new LexemeParser();

        textParser.setNextParser(paragraphParser);
        paragraphParser.setNextParser(sentenceParser);
        //sentenceParser.setNextParser(lexemeParser);

        return textParser;
    }

}
