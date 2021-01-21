package by.epam.array.action.minmax;

import by.epam.array.entity.MyArray;

public class Min {
    public int min(MyArray a){
        int m = a.getElement(0);
        int size = a.getArrSize();
        for (int i = 0; i < size; i++){
            if(a.getElement(i) < m) {
                m = a.getElement(i);
            }
        }
        return m;
    }
}
