package guvi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hunter110 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value for the matrix size : ");
	int n=sc.nextInt();
	int a[][]=new int[n][n];
	System.out.println("Enter the values for "+n+" * "+n+" Matrix : ");
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			
			a[i][j]=sc.nextInt();
		}
	}
	int sum=0;
	if(n%2!=0) {
		int c=n%2;
		for(int i=c;i<n-1;i++) {
			for(int j=0;j<n;j++) {
				sum+=a[j][i];	
			}
		}
	}
	else {
		int b=(n/2)-1;
		for(int i=b;i<n-1;i++) {
			for(int j=0;j<n;j++) {
				sum+=a[j][i];
			}
		}
	}
	System.out.println("The sum of the Middle values in the matrix is : " +sum);
}
}
