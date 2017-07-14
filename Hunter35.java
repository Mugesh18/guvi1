package guvi;

import java.util.Scanner;

public class Hunter35 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String Name :");
		String s1=sc.nextLine();
		int len=s1.length()/2;
		for(int i=0;i<len;i++) {
			String s=s1.substring(i,len);
			String s2=s1.substring(len,s1.length());
			if(s.equals(s2)) {
				System.out.println("It is Doubly String");
				break;
			}
			else {
				System.out.println("It is Not a DoublY String");
				break;
			}
		}
	}
}


