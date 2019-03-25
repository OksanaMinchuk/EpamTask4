package by.epam.javatr.minchuk.task04.view.printercreator;

import by.epam.javatr.minchuk.task04.view.ConsolePrinter;
import by.epam.javatr.minchuk.task04.view.FilePrinter;
import by.epam.javatr.minchuk.task04.view.LoggerPrinter;
import by.epam.javatr.minchuk.task04.view.Printable;

public class PrinterCreator {

    public enum PrinterType {
        CONSOLE, FILE, LOGGER
    }

    private PrinterCreator() {
    }

    public static Printable getPrinter(PrinterType printerType) {
        Printable printer = new ConsolePrinter();
        switch (printerType) {
            case FILE:
                printer = new FilePrinter();
                break;
            case LOGGER:
                printer = new LoggerPrinter();
                break;
        }
        return printer;
    }
}
