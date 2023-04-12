package sortingAlgos.bubbleSort;

public class Main {
    public static void main(String[] args){
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};
        
        // Comparing index to the next index
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){ 
            for(int i = 0; i < lastUnsortedIndex; i++){ 
                if(intArray[i] > intArray[i + 1]){ // if index is greater than next index then swap them
                    swap(intArray, i, i + 1);

                }
            }
        }
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
