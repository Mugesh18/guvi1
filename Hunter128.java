package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class Hunter128 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Array Size : ");
	int n=sc.nextInt();
	System.out.println("Enter the array values :");
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int k=0;
	Arrays.sort(arr);
		int arr1=arr.length/2;
		System.out.println("Output is :");
		for(int i=0;i<arr1;i++,k++) {
			System.out.print(arr[arr.length-1-k]+","+arr[i]+",");
		}
		if(n%2!=0) 
			System.out.print(arr[arr1]);
}
}
