package leetcode.maxDiffIncreasing;

public class Main {
    public static void main(String[] args){
        // int[] nums = new int[]{7, 1, 5, 4};
        // int[] nums = new int[]{9, 4, 3, 2};
        int[] nums = new int[]{1, 5, 2, 10};

        bruteForce(nums);
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
}
