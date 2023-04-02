package arrays.reverseStringRecursion;

public class Main {
    public static void main(String[] args){
        String input = "hello world";
        // String reversed = reverseString(input);
        String reverse = reverseStringIterative(input);
        // System.out.println(reversed);
        System.out.println(reverse);
    }
    // disadvantage of using recurssion
    // less efficient each recursion call adds a new level to the call stack.
    // can run out of memory if the input string is long
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static String reverseString(String input){
        // Checking if input has a length of 0
        if(input.length() == 0){
            // if true then we return the input
            return input;
        }
        else{
            // if false then using recursion we call the reverse method with the substring of the input string starting from the second character 
            // then we append the first character of the input string to the end of the reversed substring
            // then we return the reversed string
            return reverseString(input.substring(1)) + input.charAt(0);

        }
    }
    // Iterative Solution
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static String reverseStringIterative(String input){
        StringBuilder reverse = new StringBuilder();
        for(int i = input.length() - 1; i >= 0; i--){
            reverse.append(input.charAt(i));
        }
        return reverse.toString();
    }
}
