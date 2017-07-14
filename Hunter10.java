package guvi;

import java.util.Scanner;

public class Hunter10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Value Of n: ");
	int n = sc.nextInt();
	System.out.println("Enter the Value Of m: ");
	int m = sc.nextInt();
	int[] a = new int[n];
	int[] b = new int[m];
	System.out.println("Enter the Values of n: ");
	for(int i = 0;i < n;i++) {
		a[i] = sc.nextInt();
	}
	System.out.println("Enter the Values of m: ");
	for(int i = 0;i < m;i++) {
		b[i] = sc.nextInt();
	}
	int[] c=new int[n];
	int[] d=new int[n];
	for(int i=0;i<n-1;i++) {
		for(int j=0;j<m-1;j++) {
			if(a[i] == b[j] && a[i+1] == b[j+1] ) {
				c[i]=a[i];
				d[i]=a[i+1];
				System.out.println(c[i]+","+d[i]);
			}
			
		}
	}
	for(int i=0;i<c.length-1;i++)
		if(c[i]==0&&d[i]==0){
			System.out.println("a is not a Subset of b");
				break;}
}
}
