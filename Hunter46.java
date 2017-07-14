package guvi;

import java.util.Scanner;

public class Hunter46 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int d;
	int count1=0;
	int count2=0;
	if(n%2==0){
	for(int i=0;i<(n/2);i++) {
		count1++;
	}
	System.out.println("Total Members in team 1 : "+count1);
	for(int i=(n/2);i<n;i++)
	{
		count2++;
	}
	System.out.println("Total Members in team 2 : "+count2);
	int c=Math.abs(count1-count2);
	System.out.println("Differnce of the team is : "+c);
	}
	if(n%2!=0){
		for(int i=0;i<(n/2)+1;i++) {
			count1++;
		}
		System.out.println("Total Members in team 1 : "+count1);
		for(int i=(n/2);i<n-1;i++)
		{
			count2++;
		}
		System.out.println("Total Members in team 2 : "+count2);
		int c=Math.abs(count1-count2);
		System.out.println("Differnce of the team is : "+c);
		}
}
}
