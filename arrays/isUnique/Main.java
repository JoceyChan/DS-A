package arrays.isUnique;
import java.util.HashMap;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args){
        String str = "Milk";
        // isUnique(str);
        // isUniqueOpt(str);
        isUniqueOptTwo(str);
    }
    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    public static boolean isUnique(String str){
        char[] charArray = str.toCharArray();
        for(int i = 0; i < str.length() - 1; i++){
            for(int j = i + 1; j < str.length(); j++){
                if(charArray[i] == charArray[j]){
                    System.out.println("false");
                    return false;
                }
            }
        }
        System.out.println("true");
        return true;
    }

    // Time Complexity: O(n)
    // Space Conplexity: O(n)
    public static boolean isUniqueOpt(String str){
        Hashtable<Character, Integer> table = new Hashtable<>();
            
        for(int i = 0; i < str.length(); i++){
            if(table.containsKey(str.charAt(i))){
                System.out.println("false");
                return false;
            }
            table.put(str.charAt(i), i);
        }
        System.out.println("true");
        return true;
    }
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static boolean isUniqueOptTwo(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                System.out.println("false");
            }
            // Using a constant for all the keys reduces memory usage
            map.put(str.charAt(i), 1); // uses 1 because it is a constant and we only need to check if the key exists or not
        }
        System.out.println("true");
        return true;
    }
    
}
