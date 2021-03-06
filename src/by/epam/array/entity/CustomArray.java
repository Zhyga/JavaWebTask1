package by.epam.array.entity;

import by.epam.array.exception.ArrayException;

public class CustomArray {
    private int[] arr;

    public CustomArray(){
    }

    public CustomArray(int arrSize) throws ArrayException {
        if(arrSize < 0){
            throw new ArrayException("Array size should be >=0");
        }
        arr = new int[arrSize];
    }

    public CustomArray(int arr[]){
        this.arr = arr;
    }

    public int length(){
        return arr.length;
    }

    public int getElement(int i) {
        return arr[i];
    }

    public int[] getArray(){ return arr.clone();}

    public void setElement(int i, int value){
            arr[i] = value;
    }

    public void setArray(int[] values){
        arr = values;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("\nArray size:" + arr.length + "\n");
        for (int row : arr)
        {
            stringBuilder.append(row).append(" ");
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}
