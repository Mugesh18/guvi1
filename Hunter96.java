package guvi;

import java.util.Scanner;

public class Hunter96 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String  s=sc.nextLine();
	for(int i=0;i<s.length()-1;i++) {
		if(s.charAt(i)=='a' || s.charAt(i)=='A' ) {
			int b=(int)s.charAt(i)+25;
			System.out.print((char)b);
		}
		else {
			int b=(int)s.charAt(i)-1;
			System.out.print((char)b);
		}
		
	}
	System.out.print(s.charAt(s.length()-1));
}
}
