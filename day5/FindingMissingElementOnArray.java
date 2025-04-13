package week3.day5;

import java.util.Arrays;

public class FindingMissingElementOnArray {

	public static void main(String[] args) {
		int input[] = { 1, 4, 3, 2, 8, 6, 7 };
		Arrays.sort(input);

		for (int i = input[0]; i <= input.length - 1; i++) {
			System.out.println("vmd: " + i);
			int j;
			for ( j = 0; j < input.length; j++) {
				if (input[j] == i) {
					break;
				}
			}
			 if (j == input.length) {
	                System.out.println("Missing number is: " + i);
	                break;
	            }
			}

		}
	}
