package leetcode.twoSum;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9; 

        arrayListSol(nums, target); 
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    public static void arrayListSol(int[] nums, int target){
        ArrayList<Integer> list = new ArrayList<>(); // store the elements
        int[] res = new int[2]; // store the results we need
        
        for(int i = 0; i < nums.length; i++){ // iterating through the array
           int complement = target - nums[i];  // finding the value that will be added to get target value
            if(list.contains(complement)){ // checking to see if the list contains the complement
                res[0] = list.indexOf(complement); // initalizing the index value of the complememnt form the lsit to the result array
                res[1] = i; // initializing the result array index 1 to the indicies of the list
                System.out.println(res[0]);
                System.out.println(res[1]);
                // return res;
            }
            list.add(nums[i]); // adding values to list
        }
        // return null;
    }
}
