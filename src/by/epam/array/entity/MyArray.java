package by.epam.array.entity;



public class MyArray {
    private int[] arr;
    private int arrSize;

    public MyArray(){

    }

    public MyArray(int arrSize){
        if(arrSize < 1){
            throw new NegativeArraySizeException();
        }
        this.arrSize = arrSize;
        arr = new int[this.arrSize];
    }

    public MyArray(int arr[]){
        this.arr = arr;
        arrSize = arr.length;
    }

    public int getArrSize(){
        return arrSize;
    }

    public int getElement(int i){
        if(checkRange(i)){
            return arr[i];
        }
        else{
            throw new IndexOutOfBoundsException();
        }
    }

    public void setElement(int i, int value){
        if(checkRange(i)) {
            arr[i] = value;
        }
        else{
            throw new IndexOutOfBoundsException();
        }
    }

    private boolean checkRange(int i) {
        if (i >= 0 || i < arr.length) {
            return true;
        } else {
            return false;
        }
        //return (i >= 0 || i < arr.length); correct?
    }
}
