package sortingAlgos.selectionSort;

public class Main {
    public static void main(String[] args){
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};

        // The last unsorted index will be the last valid index 
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){ //sorting partition by 1
            int largest = 0;

            for(int i = 1; i <= lastUnsortedIndex; i++){ // looking for the largest element
                if(intArray[i] > intArray[largest]){
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
        } 

        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
    public static void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
