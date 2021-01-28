package by.epam.array.creator;

import by.epam.array.entity.CustomArray;

import java.util.stream.IntStream;

public class CustomArrayCreator {
    public void fullRandomized(CustomArray array,int minValue, int maxValue) {
        int[] clonedArray = array.getArray();
        IntStream.of(clonedArray).forEach(i -> {
            int randValue = minValue + (int)(Math.random() * maxValue);
            array.setElement(i,randValue);
        });
    }
}
