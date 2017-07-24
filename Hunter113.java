package guvi;

import java.util.Scanner;

public class Hunter113 {
public static void main(String[] args) {
	int count =0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Starting value of a prime number : ");
	int n=sc.nextInt();
	System.out.println("Enter the Ending value of a prime number : ");
	int m=sc.nextInt();
	int count1=0;
	for(int i=n;i<=m;i++){
		count=0;
		for(int j=2;j<=m;j++){
			if(i%j==0){
				count++;
			}
			
		}
		if(count==1){
			System.out.println(i);
			count1+=count;
		}
	}
	System.out.println(count1);
}
}
