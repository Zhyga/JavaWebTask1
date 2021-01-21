package by.epam.array.action.poselems;

import by.epam.array.entity.MyArray;

public class PositiveElems {
    public int amountOfPosElems(MyArray a) {
        int amount = 0;
        int size = a.getArrSize();
        for(int i = 0; i < size; i++){
            if(a.getElement(i) > 0) {
                amount++;
            }
        }
        return amount;
    }

}
