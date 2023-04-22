package leetcode.maxDiffIncreasing;

public class Main {
    public static void main(String[] args){
        // int[] nums = new int[]{7, 1, 5, 4};
        // int[] nums = new int[]{9, 4, 3, 2};
        int[] nums = new int[]{1, 5, 2, 10};

        // bruteForce(nums);
        optimizedSolution(nums);
    }
    
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int bruteForce(int[] nums){
        int maxDifference = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int sub = nums[j] - nums[i];
                if(sub > maxDifference){
                    maxDifference = sub;
                }
            }
        }
        System.out.println(maxDifference);
        return maxDifference > 0 ? maxDifference: -1;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int optimizedSolution(int[] nums){
        int maxDifference = - 1;
        int minElement = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > minElement){
                int diff = nums[i] - minElement;
                if(diff > maxDifference){
                    maxDifference = diff;
                }
            }
            else{
                minElement = nums[i];
            }
        }
        System.out.println(maxDifference);
        return maxDifference;
    }
}
