import java.util.Scanner;

public class SquareValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value which to be squared : ");
		int n=sc.nextInt();
		System.out.println("Enter Square in number :");
		int s=sc.nextInt();
			System.out.println(Math.pow(n,s));
	}

}
