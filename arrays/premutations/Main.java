package arrays.premutations;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        String str1 = "ABC";
        String str2 = "CAD";

        premutations(str1, str2);
    }
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static boolean premutations(String str1, String str2){
        HashMap<Character, Integer> strMap = new HashMap<>();
        if(str1.length() != str2.length()){
            System.out.println(false);
            return false;
        }
        for(char c : str1.toCharArray()){
            strMap.put(c, strMap.getOrDefault(c, 0) + 1);
        }
        for(char c : str2.toCharArray()){
            if (!strMap.containsKey(c)) {
                return false;
            }
            int frequency = strMap.get(c);
            if (frequency == 0) {
                return false;
            }
            strMap.put(c, frequency - 1);
        }
        return true;
    }
}
