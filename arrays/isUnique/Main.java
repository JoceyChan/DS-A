package arrays.isUnique;

public class Main {
    public static void main(String[] args){
        String str = "Coconut";
        isUnique(str);
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
}
