package by.epam.array.action.changeelem;

import by.epam.array.entity.MyArray;

public class NegativElemsToPositive {
    public void changeElem(MyArray a){
        int size = a.getArrSize();
        for(int i = 0; i < size; i++){
            if(a.getElement(i) < 0){
                int value = a.getElement(i);
                int tmp = Math.abs(value);
                a.setElement(i,tmp);
            }
        }
    }
}
