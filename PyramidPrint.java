import java.util.Scanner;


public class PyramidPrint {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Input Value : ");
	int n=sc.nextInt();
	for(int i=n;i>0;i--)
	{
		for(int j=i;j>0;j--)
		{
		System.out.print("*");
		}
		System.out.print(" ");
		for(int k=i;k>0;k--)
		{
			System.out.print("*");
	}
		System.out.println();}
		
}
}
