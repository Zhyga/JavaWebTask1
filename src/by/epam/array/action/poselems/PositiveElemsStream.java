package by.epam.array.action.poselems;

import by.epam.array.entity.CustomArray;

import java.util.stream.IntStream;

public class PositiveElemsStream {
    public int amountOfPosElems(CustomArray a){
        int[] array = a.getArray();
        int amount = (int) IntStream.of(array).filter(i -> i > 0).count();
        return amount;
    }

}
