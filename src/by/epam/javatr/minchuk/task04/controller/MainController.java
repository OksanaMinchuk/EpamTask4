package by.epam.javatr.minchuk.task04.controller;

import by.epam.javatr.minchuk.task04.model.entity.TextItem;
import by.epam.javatr.minchuk.task04.model.exception.TextNullPointerException;
import by.epam.javatr.minchuk.task04.model.exception.TextUnsupportedOperationException;
import by.epam.javatr.minchuk.task04.model.logic.SentencesSorter;
import by.epam.javatr.minchuk.task04.model.parser.ChainParser;
import by.epam.javatr.minchuk.task04.util.DataReader;
import by.epam.javatr.minchuk.task04.model.logic.LongestPalindromFinder;
import by.epam.javatr.minchuk.task04.view.Printable;
import by.epam.javatr.minchuk.task04.view.printercreator.PrinterCreator;

import java.util.List;

/**
 * Class {@code MainController}
 *
 * @autor Oksana Minchuk
 * @version 1.0 23.03.2019
 */

public class MainController {

    public static void main(String[] args) {

        DataReader dataReader = new DataReader();
        String inputText = dataReader.readFile();

        Printable printerConsole = PrinterCreator.getPrinter(PrinterCreator.PrinterType.CONSOLE);
        Printable printerLogger = PrinterCreator.getPrinter(PrinterCreator.PrinterType.LOGGER);
        Printable printerFile = PrinterCreator.getPrinter(PrinterCreator.PrinterType.FILE);

        TextItem resultText = null;

        try {
            resultText = ChainParser.getChainParser().parse(inputText);
            printerConsole.print(resultText);
            printerLogger.print(resultText);
            printerFile.print(resultText);

            printerConsole.print("Find the longest palindrome word: ");
            printerLogger.print("Find the longest palindrome word: ");
            printerFile.print("\nFind the longest palindrome word: ");
                printerConsole.print(LongestPalindromFinder.findLongestPolindrom(resultText));
                printerLogger.print(LongestPalindromFinder.findLongestPolindrom(resultText));
                printerFile.print(LongestPalindromFinder.findLongestPolindrom(resultText));

            printerConsole.print("Sorting by Increase ");
            printerLogger.print("Sorting by Increase ");
            printerFile.print("\nSorting by Increase\n");
            List<TextItem> sortSentencesIncrease = SentencesSorter.sortIncrease(resultText);
                printerConsole.print(SentencesSorter.toStringList(sortSentencesIncrease));
                printerLogger.print(SentencesSorter.toStringList(sortSentencesIncrease));
                printerFile.print(SentencesSorter.toStringList(sortSentencesIncrease));

            printerConsole.print("Sorting by Decrease ");
            printerLogger.print("Sorting by Decrease ");
            printerFile.print("\nSorting by Decrease\n");
            List<TextItem> sortSentencesDecrease = SentencesSorter.sortDecrease(resultText);
                printerConsole.print(SentencesSorter.toStringList(sortSentencesDecrease));
                printerLogger.print(SentencesSorter.toStringList(sortSentencesDecrease));
                printerFile.print(SentencesSorter.toStringList(sortSentencesDecrease));

        } catch (TextNullPointerException e) {
            e.printStackTrace();
        } catch (TextUnsupportedOperationException e) {
            e.printStackTrace();
        }
    }
}
