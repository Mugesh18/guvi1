package guvi;

import java.util.Scanner;

public class Hunter100 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Array Length : ");
	int n=sc.nextInt();
	int[] a=new int[50];
	System.out.println("Enter the Array Values : ");
	for(int j=0;j<n;j++) {
		a[j]=sc.nextInt();
	}
	int b=0;
	for(int i=0;i<n;i++) {
		b+=Math.pow(a[i],a[i+1]);
	}
	System.out.println("Ouotput is : "+b);
}
}
