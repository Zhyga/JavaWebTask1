package by.epam.array.sortmethods;

import by.epam.array.entity.CustomArray;

public class CustomArraySort {

    private void swap(CustomArray array, int index1, int index2) {
        int tmp = array.getElement(index1);
        int tmp2 = array.getElement(index2);
        array.setElement(index1,tmp2);
        array.setElement(index2,tmp);
    }

    public void bubbleSort(CustomArray array) {
        for(int i = 0; i < array.getArrSize()-1; i++){
            for(int j = i+1; j < array.getArrSize(); j++){
                int firstValue = array.getElement(i);
                int secondValue = array.getElement(j);
                if(secondValue < firstValue){
                    array.setElement(i,secondValue);
                    array.setElement(j, firstValue);
                }
            }
        }
    }

    private int minIndex(CustomArray array,int startPos)  {
        int minIndex = startPos;
        int minValue = array.getElement(startPos);
        for (int i = startPos + 1; i < array.getArrSize(); i++){
            if(array.getElement(i) < minValue) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public void selectionSort(CustomArray array) {
        for(int i = 0; i < array.getArrSize(); i++){
            int index = minIndex(array,i);
            swap(array,i,index);
        }
    }

    public void quickSort(CustomArray array, int from, int to) {
        if(from < to){
            int divideIndex = partition(array,from,to);
            quickSort(array,from,divideIndex - 1);
            quickSort(array,divideIndex, to);
        }
    }

    private int partition(CustomArray array, int from, int to) {
        int leftIndex = from;
        int rightIndex = to;
        int deciderElem = array.getElement(from);
        while(leftIndex <= rightIndex){
            while(array.getElement(leftIndex) < deciderElem){
                leftIndex++;
            }
            while(array.getElement(rightIndex) > deciderElem){
                rightIndex--;
            }
            if(leftIndex <= rightIndex){
                swap(array,rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

}
