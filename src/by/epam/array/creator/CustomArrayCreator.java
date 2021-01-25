package by.epam.array.creator;

import by.epam.array.entity.CustomArray;
import by.epam.array.exception.ArrayException;
import by.epam.array.validator.Validation;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CustomArrayCreator {
    public void fullRandomized(CustomArray array,int minValue, int maxValue) {
        for(int i = 0; i < array.getArrSize(); i++){
            int randValue = minValue + (int)(Math.random() * maxValue);
            array.setElement(i,randValue);
        }
    }

    public void fromFile(){
        CustomArray array = null;
        String fileName = "C:\\Users\\user\\IdeaProjects\\MyArray\\textFile.txt";
        Path path = Paths.get(fileName);
        Scanner scanner = null;
        try {
            scanner = new Scanner(path);
            scanner.useDelimiter(System.getProperty("line.separator"));
            while(scanner.hasNext()){
                String line = scanner.next();
                if(Validation.validate(line)) {
                    array = setArray(array, line);
                    break;
                }
            }
        } catch (IOException | ArrayException e) {
            e.printStackTrace();
        }
        finally {
            scanner.close();
        }
    }

    private CustomArray setArray(CustomArray array,String line) throws ArrayException {
        String strings[] = line.split(" ");
        array = new CustomArray(strings.length);
        for(int i = 0; i < array.getArrSize(); i++){
            array.setElement(i,Integer.parseInt(strings[i]));
        }
        return array;
    }
}
