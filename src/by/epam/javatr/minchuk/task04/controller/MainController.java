package by.epam.javatr.minchuk.task04.controller;

import by.epam.javatr.minchuk.task04.model.entity.TextItem;
import by.epam.javatr.minchuk.task04.model.exception.TextNullPointerException;
import by.epam.javatr.minchuk.task04.model.exception.TextUnsupportedOperationException;
import by.epam.javatr.minchuk.task04.model.parser.ChainParser;
import by.epam.javatr.minchuk.task04.model.parser.TextParser;
import by.epam.javatr.minchuk.task04.util.DataReader;
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
        String inputText = dataReader.readFile();

        Printable printer = PrinterCreator.getPrinter(PrinterCreator.PrinterType.CONSOLE);

        TextItem resultText = null; //2
        try {
            resultText = ChainParser.getChainParser().parse(inputText);
        } catch (TextNullPointerException e) {
            e.printStackTrace();
        }
        printer.print(resultText);

//        printer.print("resultText.getTextItemType" + resultText.getTextItemType());
//        printer.print("resultText.toString" + resultText.toString());
//        printer.print("***content: ");
//        printer.print("resultText.getContent().length()" + resultText.getContent().length());
//        try {
//            printer.print("resultText.getChild().getClass" + resultText.getChild().getClass());
//            printer.print("resultText.getChild().get(0).getTextItemType()" + resultText.getChild().get(0).getTextItemType());
//            printer.print("****");
//            printer.print("resultText.getChild().get(0).toString()" + resultText.getChild().get(0).toString());
//            printer.print("resultText.getChild().get(0).getContent()" + resultText.getChild().get(1).getContent());
//            printer.print("****");
//
//            printer.print("resultText.getChild().get(0).getChild().get(0).getTextItemType" + resultText.getChild().get(0).getChild().get(0).getTextItemType());
//            printer.print("resultText.getChild().get(1).getChild().get(0).size" + resultText.getChild().get(1).getChild().size());
//
//        } catch (TextUnsupportedOperationException e) {
//            e.printStackTrace();
//        }






    }

}
