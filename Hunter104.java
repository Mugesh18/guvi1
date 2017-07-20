package guvi;

import java.util.Scanner;

public class Hunter104 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	if(s1.length()>0 && s1.length()<=100 && s1.length()>0 && s1.length()<=100) {
	for(int i=0;i<s1.length();i++) {
		for(int j=0;j<s2.length();j++) {
			if(i==j)
			System.out.println(s2.charAt(j)+""+s1.charAt(i));
		}
	}
	if(s1.length()>s2.length()) {
	for(int i=s2.length();i<s1.length();i++) {
		System.out.println(s1.charAt(i));
	}
	}
	if(s2.length()>s1.length()) {
		for(int i=s1.length();i<s2.length();i++) {
			System.out.println(s2.charAt(i));
		}
	}
	}
	else
		System.out.println("It is not under the eligible character defined by the user.");
	
}
}
