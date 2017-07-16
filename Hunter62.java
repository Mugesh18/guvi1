package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class Hunter62 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<10;i++) {
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	int b=a[n-1]-a[0];
	System.out.println(b+"Thousand");
}
}
