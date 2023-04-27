package leetcode.twoFurthestHouses;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        int[] colors = new int[]{1, 1, 1, 6, 1, 1, 1};
        // int[] colors = new int[]{1,8,3,8,3};
        // int[] colors = new int[]{0, 1};

        // bruteForce(colors);
        optimized(colors);
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int bruteForce(int[] colors){
        int maxDistance = Integer.MIN_VALUE;
        int len = colors.length;

        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len; j++){
                if(colors[i] != colors[j]){
                    int distance = j - i;
                    if(distance > maxDistance){
                        maxDistance = distance;
                    }
                }
            }
        }
        System.out.println(maxDistance);
        return maxDistance;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int optimized(int[] colors){
        int ans = -1;
        int left = 0,right = colors.length - 1;
        while(left <= right){
            if(colors[left] == colors[right]){
                right--;
            }
            else{
                ans = Math.max(ans, right - left);
                left++;
                right = colors.length - 1;
            }
        }
        System.out.println(ans);
        return ans;
    }
}
