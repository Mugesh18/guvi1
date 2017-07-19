package guvi;

import java.util.Scanner;

public class Hunter99 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[50];
	int count =0,k=0;
	Boolean b=false;
	for(int i=10;i<100;i++){
		count = 0;
		for(int j=2;j<100;j++){
			if(i%j==0){
				count++;
			}
			
		}
		if(count==1){
			a[k]=i;
			k++;
		}
	}
	int c=0;
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
			if(a[i]>10 && a[i]<=99 && a[i]!=0 && a[j]!=0){
				 c=a[i]+a[j];
				 if(n==c){
				System.out.println("Output is equal to input"+a[i]+"+"+a[j]+"="+n);
			}
			}
		}
		
		}
	}
	
}

