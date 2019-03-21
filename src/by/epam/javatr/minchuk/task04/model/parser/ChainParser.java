package by.epam.javatr.minchuk.task04.model.parser;

public class ChainParser {

    public static AbstractParser getChainParser() {

        AbstractParser paragraphParser = new ParagraphParser();
        AbstractParser sentenceParser = new SentenceParser();
        AbstractParser lexemeParser = new LexemeParser();
        AbstractParser wordParser = new WordParser();

        paragraphParser.setNextParser(sentenceParser);
        sentenceParser.setNextParser(lexemeParser);
        lexemeParser.setNextParser(wordParser);

        return paragraphParser;
    }

}
