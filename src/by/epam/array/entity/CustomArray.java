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

//    public static CustomArray createArray(String line) throws ArrayException {
//        String strings[] = line.split(" ");
//        CustomArray array  = new CustomArray(strings.length);
//        for(int i = 0; i < array.length(); i++){
//            array.setElement(i,Integer.parseInt(strings[i]));
//        }
//        return array;
//    }

    public static CustomArray createArray(int[] values) throws ArrayException {
        CustomArray array = new CustomArray(values.length);
        for(int i = 0; i < array.length(); i++){
            array.setElement(i,values[i]);
        }
        return array;
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
