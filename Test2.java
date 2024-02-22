package edu.neu.mgen;

public class Test2 {
    public static void main(String[] args) {
        String str = "Oakland";

        // Find the length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Find a character with index 2 in the string
        char charAtIndex2 = str.charAt(2);
        System.out.println("Character at index 2: " + charAtIndex2);

        // Extract a substring "land" from str
        String substring = str.substring(2); // Starting from index 2 to the end
        System.out.println("Substring \"land\": " + substring);

        // Convert all letters in str to capital letters "OAKLAND"
        String uppercaseStr = str.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseStr);
    }
}
