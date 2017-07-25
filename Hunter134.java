package guvi;

import java.util.Scanner;

public class Hunter134 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int input1=sc.nextInt();
	int input2=sc.nextInt();
	int count1=0,count2=0;
	for(int i=1;i<input1;i++) {
		if(input1%i==0)
			count1++;
	}
	for(int i=1;i<input2;i++) {
		if(input2%i==0)
			count2++;
	}
	if(count1==1 && count2==1) 
		System.out.println("It is a co-prime");
	else
		System.out.println("It is not a co-prime");
}
}
