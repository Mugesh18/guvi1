package guvi;

import java.util.Scanner;

public class Hunter043 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String : ");
	String s=sc.nextLine();
	for(int i=0;i<s.length()-1;i++) {
		if(s.charAt(i)>=97 && s.charAt(i)<=122 && s.charAt(i+1)-48 >=0 && s.charAt(i+1)-48<=9) {
			int a=s.charAt(i+1)-48;
			if(a>=0 && a<=9) {
				for(int j=0;j<a;j++) {
					System.out.print(s.charAt(i));
				}
			}
		}
	}
}
}	

