package by.epam.array.action.sum;

import by.epam.array.entity.MyArray;

public class Sum {
    public int sum(MyArray a){
        int size = a.getArrSize();
        int sum = 0;
        for (int i = 0; i < size; i++){
            sum += a.getElement(i);
        }
        return sum;
    }
}
