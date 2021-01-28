package by.epam.array.action.simplemath;

import by.epam.array.entity.CustomArray;

import java.util.stream.IntStream;

public class MathArrayActionStream {
    public double avg(CustomArray a){
        int[] array = a.getArray();
        return IntStream.of(array).average().getAsDouble();
    }

    public int sum(CustomArray a){
        int[] array = a.getArray();
        return IntStream.of(array).sum();
    }

    public int max(CustomArray a){
        int[] array = a.getArray();
        return IntStream.of(array).max().getAsInt();
    }

    public int min(CustomArray a){
        int[] array = a.getArray();
        return IntStream.of(array).min().getAsInt();
    }

}
