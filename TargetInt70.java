import java.util.Scanner;


public class TargetInt70 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Ente the array Size : ");
	int a=sc.nextInt();
	int[] n=new int[a];
	int sum=0;
	for(int i=0;i<a;i++)
	{
		n[i]=sc.nextInt();
	}
	System.out.println("Enter the value of m : ");
	int m=sc.nextInt();
	System.out.println("Enter the Target Value : ");
	int t=sc.nextInt();
	for(int i=0;i<a;i++)
	{
		sum+=n[i];
	}
	if(sum==t)
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}
}
}
