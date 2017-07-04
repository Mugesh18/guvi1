import java.util.Scanner;
public class FindRotateIndexHunter60 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array size : ");
	int n=sc.nextInt();
	int[] a=new int[n];
	int[] b=new int[n];
	System.out.println("Enter the array values : ");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Enter the rotated array values : ");
	for(int i=0;i<n;i++)
	{
		b[i]=sc.nextInt();
	}
	int t=0;
	int j=0;
	for(int i=0;i<a.length;i++)
	{
			if(a[i]==b[j])
			{
				 t=i;
				 
			}
	
	}System.out.println("The Index value of Rotated array is : "+t);
}
}
