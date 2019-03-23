package by.epam.javatr.minchuk.task04.controller;

import by.epam.javatr.minchuk.task04.model.entity.TextItem;
import by.epam.javatr.minchuk.task04.model.entity.Word;
import by.epam.javatr.minchuk.task04.model.parser.AbstractParser;
import by.epam.javatr.minchuk.task04.model.parser.ChainParser;
import by.epam.javatr.minchuk.task04.util.DataReader;
import by.epam.javatr.minchuk.task04.util.DataWriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class {@code MainController}
 *
 * @autor Oksana Minchuk
 * @version 1.0 23.03.2019
 */

public class MainController {

    public static void main(String[] args) {

        //DataReader dataReader = new DataReader();
        //String inputText = dataReader.readFile();

        //DataWriter dataWriter = new DataWriter();
        //dataWriter.writeFile(inputText);

        AbstractParser parserChain = ChainParser.getChainParser();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("InputData.txt"));
            String string;
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                System.out.println(bufferedReader.readLine());

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private final String DATA_PATTERN = "^[a-zA-Zа-яА-Я\\s]+";
    String str = "";

    public boolean isDataCorrect (String str) {
        Pattern pattern = Pattern.compile(DATA_PATTERN);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
