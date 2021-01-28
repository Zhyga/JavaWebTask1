package by.epam.array.action.simplemath;

import by.epam.array.entity.CustomArray;

public class MathArrayAction {
    public double avg(CustomArray a){
        double average = 0;
        int size = a.length();
        for(int i = 0; i < size; i++){
            average += a.getElement(i);
        }
        average /= size;
        return average;
    }

    public int sum(CustomArray a){
        int size = a.length();
        int sum = 0;
        for (int i = 0; i < size; i++){
            sum += a.getElement(i);
        }
        return sum;
    }

    public int max(CustomArray a){
        int max = a.getElement(0);
        int size = a.length();
        for (int i = 0; i < size; i++) {
            if (a.getElement(i) > max) {
                max = a.getElement(i);
            }
        }
        return max;
    }

    public int min(CustomArray a){
        int min = a.getElement(0);
        int size = a.length();
        for (int i = 0; i < size; i++){
            if(a.getElement(i) < min) {
                min = a.getElement(i);
            }
        }
        return min;
    }

}