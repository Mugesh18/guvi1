import java.util.Scanner;
public class ReverseString {
	public static void main(String []args){
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		String reverse=new StringBuffer(s).reverse().toString();
		System.out.println(reverse);
	}
}
