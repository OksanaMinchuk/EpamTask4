package by.epam.javatr.minchuk.task04.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class DataWriter {

    private static final String FILE_PATH = "OutputData.txt";
    private File fileName;

    public DataWriter() {
        fileName = new File(FILE_PATH);
    }

    public void writeFile(Object ob) {
        try (FileWriter fileWriter = new FileWriter(FILE_PATH)) {
            fileWriter.write(ob.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





