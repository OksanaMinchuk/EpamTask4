package by.epam.javatr.minchuk.task04.controller;

import by.epam.javatr.minchuk.task04.model.entity.TextItem;
import by.epam.javatr.minchuk.task04.model.entity.Word;
import by.epam.javatr.minchuk.task04.util.DataReader;
import by.epam.javatr.minchuk.task04.util.DataWriter;

public class MainController {

    public static void main(String[] args) {

        DataReader dataReader = new DataReader();
        String inputText = dataReader.readFile();

        DataWriter dataWriter = new DataWriter();
        //dataWriter.writeFile(inputText);

        TextItem word = new Word("sdsd");
        System.out.println();
    }
}
