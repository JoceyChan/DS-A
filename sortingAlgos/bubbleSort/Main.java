package sortingAlgos.bubbleSort;

public class Main {
    public static void main(String[] args){

    }
    public static void swap(int[] array, int i, int j){ // swap method
        if(i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
