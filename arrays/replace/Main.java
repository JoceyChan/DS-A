package arrays.replace;

public class Main {
    public static void main(String[] args){
        char[] str = "Mr John Smith    ".toCharArray();
        int trueLength = 13;
        urlify(str, trueLength);
        System.out.println(new String(str)); 
    }
    // Time Complexity: O(n)
    // Space Complexity: O()
    public static void urlify(char[] str, int trueLength) {
        // count the number of spaces
        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        // calculating the new length of the string 
        // multiplying by 2 instead of 3 because we will also be replacing the space which counts as 1 so in total it's 3
        int index = trueLength + spaceCount * 2;
        // iterating through the string in reverse order and replacing the spaces with '%20'
        for (int i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[--index] = '0'; // --index because we are going in reverse order
                str[--index] = '2';
                str[--index] = '%';
            } else {
                str[--index] = str[i];
            }
        }
    }
}
