package arrays.replaceChar;

public class Main {
    public static void main(String[] args){
        String str = "A letter sent to you";
        // creating a charArray from the string
        char[] charArray = str.toCharArray();

        // Iterating through the array of character, looking for any "A" characters
        for(int i = 0; i < charArray.length; i++){
            // if character 'A' is found then replace it with 't' and using helper method to insert the characters in the array
            if(charArray[i] == 'A'){
                charArray[i] = 't';
                charArray = insertAtPosition(charArray, i+1, "he".toCharArray());
            }
        }
        // Conversts modified array of characters back into a String 
        String output = new String(charArray);
        System.out.println(output);

    }
    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    // Helper Method: used to insert the characters at the appropriate position in the array
    public static char[] insertAtPosition(char[] charArray, int index, char[] toInsert){
        char[] res = new char[charArray.length + toInsert.length];
        System.arraycopy(charArray, 0, res, 0, index);
        System.arraycopy(toInsert, 0, res, index, toInsert.length);
        System.arraycopy(charArray, index, res, index + toInsert.length, charArray.length - index);        
        
        return res;
    }
}

// Replace all A's in a string with "the"

// create a charArray from the string