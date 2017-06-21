package factorial;
import java.util.Scanner;
public class Factorial {
	public static void main(String []args)
	{
		int f=1;
		System.out.println("Enter a number");
		Scanner n=new Scanner(System.in);
		int m=n.nextInt();
		for(int a=m;a>=1;a--)
		{
			f=f*a;
		}
		System.out.println(f);
	}

}
