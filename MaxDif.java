import java.util.Scanner;
public class MaxDif {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	int max=-1236544;
	int[] diff=new int [n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int j=0;j<n-1;j++)
	{
		diff[j]=Math.abs(a[j]-a[j+1]);
	}
	for(int k=0;k<diff.length;k++)
	{
		if(max<diff[k])
		{
			max=diff[k];
			
		}
		
	}
	for(int l=0;l<diff.length;l++)
	{
		if(max==diff[l])
		{
			System.out.println(l);
		}
	}
	System.out.println("Max Difference : "+max);
}
}
