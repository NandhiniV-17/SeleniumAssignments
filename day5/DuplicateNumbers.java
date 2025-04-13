package week3.day5;

import java.util.Arrays;

public class DuplicateNumbers {

	public static void main(String[] args) {
		int[] num={2, 5, 7, 7, 5, 9, 2, 3};
		int length = num.length;
		System.out.println("Length is " + length);
		Arrays.sort(num);
		System.out.println("The Sorted Numbers are");
		for (int i=0; i<length ; i++)
			System.out.print(num[i]+ " ");
		System.out.println("\nThe Duplicate Numbers are");
		for (int j=0; j<length-1 ; j++)
		if (num[j] == num[j+1])
			System.out.println(num[j]);
	}

}
