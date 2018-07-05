import java.util.Scanner;


public class Palindrome {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a value : ");
		
		String s=sc.nextLine();
		
		if((new StringBuffer(s).reverse().toString()).equals(s))
			System.out.println("The given value is a palindrome : "+s);
		else
			System.out.println("The given value is not a palindrome : "+s);
		
		
	}
}
