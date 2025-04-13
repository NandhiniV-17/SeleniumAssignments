package week3.day5;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] charArray1 = test.toCharArray();
		System.out.println("The given string is " + test);
		System.out.print("\nThe Output is ");
		for (int i=0; i<charArray1.length; i++)
		{
			if (i % 2 != 0) {
                // Convert to upper case
                charArray1[i] = Character.toUpperCase(charArray1[i]);
            }
			//System.out.println(charArray1);
		}
		System.out.print(charArray1);

	}

}
