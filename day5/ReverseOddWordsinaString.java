package week3.day5;

public class ReverseOddWordsinaString {

	public static void main(String[] args) {
		String test = "I am a software tester";
		System.out.print("The given String is: " + test + "\nThe output string is : ");
		// Split the sentence into words
		String[] words = test.split(" ");
		// Traverse through each word using loop
		for (int i = 0; i < words.length; i++) {
			// Check if the index is odd
			if (i % 2 != 0) {
				// Convert the word at odd index to a character array
				char[] charArray = words[i].toCharArray();
				// Reverse the characters in the array
				for (int j = charArray.length - 1; j >= 0; j--) {
					System.out.print(charArray[j]);
				}
			} else {
				// Print the even index word as it is
				System.out.print(words[i]);
			}
			System.out.print(" ");
		}
	}
}
