package by.epam.javatr.minchuk.task04.controller;

import by.epam.javatr.minchuk.task04.model.entity.TextItem;
import by.epam.javatr.minchuk.task04.model.exception.TextNullPointerException;
import by.epam.javatr.minchuk.task04.model.exception.TextUnsupportedOperationException;
import by.epam.javatr.minchuk.task04.model.logic.SentencesSorter;
import by.epam.javatr.minchuk.task04.model.parser.ChainParser;
import by.epam.javatr.minchuk.task04.util.DataReader;
import by.epam.javatr.minchuk.task04.model.logic.LongestPalindromFinder;
import by.epam.javatr.minchuk.task04.util.DataWriter;
import by.epam.javatr.minchuk.task04.view.Printable;
import by.epam.javatr.minchuk.task04.view.printercreator.PrinterCreator;

/**
 * Class {@code MainController}
 *
 * @autor Oksana Minchuk
 * @version 1.0 23.03.2019
 */

public class MainController {

    public static void main(String[] args) {

        DataReader dataReader = new DataReader();
        DataWriter dataWriter = new DataWriter();
        String inputText = dataReader.readFile();


        Printable printerConsole = PrinterCreator.getPrinter(PrinterCreator.PrinterType.CONSOLE);
        Printable printerLogger = PrinterCreator.getPrinter(PrinterCreator.PrinterType.LOGGER);

        TextItem resultText = null;

        try {
            resultText = ChainParser.getChainParser().parse(inputText);
            printerConsole.print(resultText);
            printerLogger.print(resultText);
            dataWriter.writeFile(resultText);

            printerConsole.print("Find the longest palindrome word ");
            printerLogger.print("Find the longest palindrome word ");
            printerConsole.print(LongestPalindromFinder.findLongestPolindrom(resultText));
            printerLogger.print(LongestPalindromFinder.findLongestPolindrom(resultText));

            printerConsole.print("Sorting by Increase ");
            printerLogger.print("Sorting by Increase ");
            printerConsole.print(SentencesSorter.sortIncrease(resultText));
            printerLogger.print(SentencesSorter.sortIncrease(resultText));
            
        } catch (TextNullPointerException e) {
            e.printStackTrace();
        } catch (TextUnsupportedOperationException e) {
            e.printStackTrace();
        }
    }
}
