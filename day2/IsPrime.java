package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int n = 15;
				
		for (int i = 2; i < n-1 ; i++) {
            if (n % i == 0) {
            	System.out.println("The given number " + n + " is a not Prime number");
            	break;
            }
            else
			System.out.println("The given number " + n + " is a Prime number");
            break;
	}
	}
}
