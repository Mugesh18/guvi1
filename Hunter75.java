package guvi;
import java.util.Scanner;

public class Hunter75 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Size of the Array :");
	int n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("Enter the Array Values : ");
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("OUTPUT : ");
	for(int i=0;i<a.length-1;i++) {
		
		if(a[i]>a[i+1]) {
			System.out.print(a[i+1]+" ");
		}
		else
		{
			System.out.print("-1 ");
		}		
	}
	System.out.println("-1");
}
}
