package guvi;

import java.util.Scanner;

public class Pro17 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int mul=n;
	while(n>0) {
		int tem=n%10;
		mul*=tem;
		n/=10;
	}
	System.out.println(mul);
}
}
