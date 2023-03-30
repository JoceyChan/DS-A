package arrays.palindromePrem;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        String str = "Tact Coa".replaceAll(" ", "");
        // str.replaceAll(" ", "");
        palindromePrem(str);
    }

    public static boolean palindromePrem(String str){
        str = str.toLowerCase();
        HashMap<Character, Integer> charFrequency = new HashMap<>();
        // Updates the frequency count of each character in the input string 'str', excluding spaces.
        // This frequency count is used to check if the string is a palindrome premutation.
        for (char c : str.toCharArray()) {
            if (c != ' ') {
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1); 
                // .put updates the frequency of the count of 'c' in map. if character has not been seen before then it adds it to the map w/a frequency count of 1. Otherwise, it updates the existing frequency count with the new count
                // .getOrDefault gets current frequency count of the character 'c' from the map. If the character has not been seen before, then it defaults to a freuency count of 0. the code then increments to 1.
            }
        }
        int oddCount = 0;
        for (int frequency : charFrequency.values()) {
            // .values() returns a collection that contains all values in the map
            if (frequency % 2 == 1) {
                oddCount++;
            }
            if (oddCount > 1) {
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }
}
// Problem 1.4 Palindrome Premutations 
// Given a function to check if it is a premutation of a palindrome. 
// A palindrome is a word or phrase that is the same fowards and backwards. 
// A premutation is a rearrangment of letters. The palindrome does not need 
// to be limited to just dictionary words. 

// I/P: Tact Coa || O/P: True (permutations: "taco cat", "atco cta", etc.)


// Brute Force
// 1. remove all spaces
// 2. iterate through string
// 3. check if 1st letter is the same as the last letter