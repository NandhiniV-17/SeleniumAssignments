package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0, b = 1, n = 8;
		System.out.print(" The Fibonacci Series of " + a + " and " + b + " :" + a + " "+ b);
		for (int i = 3; i <= n; i++) {
			int c = a + b;
			System.out.print( " " + c);
			a = b;
			b = c;
		}
	}

}
