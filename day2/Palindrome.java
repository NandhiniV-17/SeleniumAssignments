package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int input=1221, output = 0;
        int originalInput = input; 
        for (int i = input; i > 0; i /= 10) {
            int remainder = i % 10;        
            output = output * 10 + remainder;  
        }
        if (input == output) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is not a Palindrome.");
        }
		}

}
