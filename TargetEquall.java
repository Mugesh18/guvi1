import java.util.Scanner;


public class TargetEquall {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Enter the Target Value : ");
	int target=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]+a[j]==target)
			{
				System.out.println(a[i]+","+a[j]);
			}
		}
	}
}
}
