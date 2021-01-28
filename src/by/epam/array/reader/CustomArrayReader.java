package by.epam.array.reader;

import by.epam.array.entity.CustomArray;
import by.epam.array.exception.ArrayException;
import by.epam.array.validator.Validation;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CustomArrayReader {
    private static Logger logger = LogManager.getRootLogger();

    public CustomArray fromFile(String filePath) throws ArrayException {
        CustomArray array = null;
        Path path = Paths.get(filePath);
        Scanner scanner = null;
        if(Files.exists(path) && !Files.isDirectory(path) && Files.isReadable(path)) {
            try {
                logger.info("File was open:" + filePath);
                scanner = new Scanner(path);
                scanner.useDelimiter(System.getProperty("line.separator"));
                while (scanner.hasNext()) {
                    String line = scanner.next();
                    if (Validation.lineIsNumeric(line)) {
                        int[] values = strArrayToInt(line);
                        array.setArray(values);
                        break;
                    }
                }

            } catch (IOException e) {
                throw new ArrayException();
            } finally {
                scanner.close();
                logger.info("File closed");
            }
        }
        else{
            logger.error("File can't be open");
            throw new ArrayException("Wrong file path" + filePath);
        }
        return array;
    }

    private int[] strArrayToInt(String line){
        String strings[] = line.split(" ");
        int[] array  = new int[strings.length];
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(strings[i]);
        }
        return array;
    }
}
