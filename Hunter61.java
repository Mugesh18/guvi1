package guvi;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Hunter61 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<Integer> set=new TreeSet<Integer>();
		System.out.println("ENter the Array Size : ");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter Array Values : ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int min1=999;
		int temp=0;
		System.out.println("Enter the two elements : ");
		int b=sc.nextInt();
		int c=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(a[i]==b || a[i]==c) {
				temp=a[i]==b?c:b;
				int j=i;
				int distance=0;
				if(j<n-1 && a[i]!=temp) {
					distance++;
					j++;
				}
				if(a[i]==temp && distance<min1) {
					min1=distance;
				}
				}
			}
		if(min1==999) {
			System.out.println("Invalid Input");
		}
		else {
			
			System.out.println("Min Distance ("+b+","+c+" ) :"+min1);
		}
			}

}
