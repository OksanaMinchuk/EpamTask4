//package by.epam.javatr.minchuk.task04.model.parser;
//
//import by.epam.javatr.minchuk.task04.model.entity.Lexeme;
//import by.epam.javatr.minchuk.task04.model.entity.PunctuationSign;
//import by.epam.javatr.minchuk.task04.model.entity.TextItem;
//import by.epam.javatr.minchuk.task04.model.entity.Word;
//import by.epam.javatr.minchuk.task04.model.exception.TextNullPointerException;
//import by.epam.javatr.minchuk.task04.model.exception.TextUnsupportedOperationException;
//import by.epam.javatr.minchuk.task04.util.validator.Validator;
//import org.apache.log4j.Logger;
//
//
///**
// * Class {@code LexemeParser}
// *
// * @autor Oksana Minchuk
// * @version 1.0 23.03.2019
// */
//public class LexemeParser extends AbstractParser {
//
//    private static final Logger LOGGER;
//
//    static {
//        LOGGER = Logger.getRootLogger();
//    }
//
//    private static final String WORD_PUNKT_SEPARATOR_REGEX = " ";
//
//    /**
//     * Returns Lexeme (a container of words and punctuation sign)
//     *
//     * @param text
//     * @return lexemeList
//     */
//    @Override
//    public TextItem parse(String text) throws TextNullPointerException {
//        if (text != null) {
//            LOGGER.info("   -start lexeme parsing");
//            String lexemeString = text.replace(" ", "");
//            TextItem parseLexeme = new Lexeme();
//            try {
//                if (Validator.isWord(lexemeString)) {
//                    parseLexeme.addItem(new Word(lexemeString));
//                    LOGGER.info("       _add word_ " + lexemeString);
//                } else {
//                    parseLexeme.addItem(new PunctuationSign(lexemeString));
//                    LOGGER.info("       _add PunctuationSign_ " + lexemeString);
//                }
//            } catch (TextUnsupportedOperationException e) {
//                e.printStackTrace();
//            }
//            LOGGER.info("   -end lexeme parsing");
//            return parseLexeme;
//        }
//        throw new TextNullPointerException();
//    }
//}
