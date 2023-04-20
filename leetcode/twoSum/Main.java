package leetcode.twoSum;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9; 

        // bruteForce(nums, target); 
        // arrayListSol(nums, target); 
        optimizedSol(nums, target);
    }
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static void bruteForce(int[] nums, int target){
        int[] res = new int[2];

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int sum = nums[i] + nums[j];
                if(sum == target && i != j){
                    res[0] = i;
                    res[1] = j;
                    System.out.println(res[0]);
                    System.out.println(res[1]);
                    // return res;
                }
            }
        }
        // return null;
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

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void optimizedSol(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i]; 
            if(map.containsKey(complement) && map.get(complement) != i){
                int[] res = new int[2];
                res[0] = map.get(complement);
                res[1] = i;
                System.out.println(res[0]);
                System.out.println(res[1]);
                // return res;
            }
            map.put(nums[i], i);
        }
        // return null;
    }
}
