package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class Pro2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Array Size : ");
	int n= sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter size that want to be deleted : ");
	int m=sc.nextInt();
	System.out.println("Enter the Arrray Elements : ");
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	System.out.println("Before Deleting : \n");
	for(int i=0;i<n;i++) {
		System.out.println(a[i]);
	}
	for(int i=m;i<n;i++) {
		a[i]=0;
	}
	System.out.println("After Deleting : ");
	for(int i=0;i<n-m;i++) {
		System.out.println(a[i]+" ");
	}
}
}
