package by.epam.array.action.changeelem;

import by.epam.array.entity.CustomArray;

import java.util.stream.IntStream;

public class NegativElemsToPositiveStream {
    public void changeElem(CustomArray a){
        int[] array = a.getArray();
        IntStream.of(array).forEach(i -> {
            if(i < 0){
                int value = array[i];
                int tmp = Math.abs(value);
                a.setElement(i,tmp);
            }
        });
    }
}
