package week3.day5;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//input strings declaration
		String  text1 ="stops";
		String text2 = "potss";
		// Check if the lengths are equal
		if (text1.length() != text2.length())
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram.");
        return;
		}
		// Convert strings to character arrays
		char[] charArray1 = text1.toCharArray();
        char[] charArray2 = text2.toCharArray();
        // Sort both character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        // Compare the sorted arrays
        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("The given strings are Anagram.");
        } else {
            System.out.println("The given strings are not an Anagram.");
        }
	}
}
     
		
   
