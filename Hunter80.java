package guvi;

import java.util.Scanner;

public class Hunter80 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Value to validate : ");
	String n=sc.nextLine();
	int len=n.length();
	int a=Integer.parseInt(n);
	int count=0;
	int d=0;
	int b[]=new int[len];
	int c[]=new int[len];
	while(a!=0) {
		int temp=a%10;
		b[len-1]=temp;
		count++;
		a/=10;
		len--;
		
	}
	for(int i=0;i<count-1;i++) {
		int diff=b[i]-b[i+1];
		c[i]=Math.abs(diff);
		if(c[i]==1) {
			d++;
		}
	}
	if(d==count-1) {
		System.out.println("It is a Jumping Numbers");
	}
	else {
		System.out.println("Not a Jumping Numbers");
	}
	}
}