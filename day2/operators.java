package week1.day2;

public class operators {

	public static void main(String[] args) {
		int a = 7;
		System.out.println("ASSIGNMENT" + "\na=7" + "\nThe o/p for (a++ + ++a - a--) is " + (a++ + ++a - a--));
		int b = 7, c = 2;
		System.out.println("------------" + "\nArithmetic Operators" + "\nb=7 and c=2");
		System.out.println("b+c = " + (b + c) + "\nb-c = " + (b - c) + "\nb*c = " + (b * c)
				+ "\nThe quotient for b/c is " + (b / c) + "\nThe remainder for b/c is " + (b % c));
		System.out.println("------------" + "\nComparison Operators" + "\nb=7 and c=2");
		System.out.println("The o/p of b>c is " + (b > c));
		System.out.println("The o/p of b<c is " + (b < c));
		System.out.println("The o/p of b++c is " + (b == c));
		System.out.println("The o/p of b!=c is " + (b != c));
		System.out.println("------------" + "\nLogical Operators" + "\nb=7 and c=2");
		System.out.println("The o/p of b>c && b==c is " + (b > c && b == c));
		System.out.println("The o/p of b>c || b==c is " + (b > c || b == c));
	}

}
