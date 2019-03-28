package by.epam.javatr.minchuk.task04.view;

import java.io.*;

public class FilePrinter implements Printable {

    private File file = new File("OutputData.txt");

    @Override
    public void print(Object ob) {
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write(ob.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
