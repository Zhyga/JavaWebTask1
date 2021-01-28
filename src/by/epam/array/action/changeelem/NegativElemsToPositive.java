package by.epam.array.action.changeelem;

import by.epam.array.entity.CustomArray;

public class NegativElemsToPositive {
    public void changeElem(CustomArray array){
        int size = array.length();
        for(int i = 0; i < size; i++){
            if(array.getElement(i) < 0){
                int value = array.getElement(i);
                int tmp = Math.abs(value);
                array.setElement(i,tmp);
            }
        }
    }
}