package guvi;

import java.util.Scanner;

public class Hunter69 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	char[] a=s.toCharArray();
	int at=0;
	int dot=0;
	if(s.length()>12) {
	for(int i=0;i<s.length();i++)	{
		if(s.charAt(i)=='@'|| s.charAt(i)=='.') {
			int count=s.charAt(i)=='@'?at++:dot++;		
		}
	}
	if(at==1 && dot==1) {
		try{
			int btwatdot=s.substring(s.indexOf('@')+1,s.indexOf('.')).length();
		int beforeat=s.substring(0,s.indexOf('@')).length();
		if(btwatdot>3 && beforeat >2 && s.substring(s.length()-4,s.length()).equals(".com")) {
			System.out.println("VALID MAIL ID");
		}
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("INVALID MAIL ID");
		}
	}		
}
	else
	{
		System.out.println("Invalid Type of Mail ID");
	}
}
}