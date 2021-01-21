package by.epam.array.action.average;

import by.epam.array.entity.MyArray;

public class Average {
    public double avg(MyArray a){
        double average = 0;
        int size = a.getArrSize();
        for(int i = 0; i < size; i++){
            average += a.getElement(i);
        }
        average /= size;
        return average;
    }
}
