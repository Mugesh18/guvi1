package guvi;

import java.util.Scanner;

public class Hunter123 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String s=sc.nextLine();
	int count=0;
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		for(int j=0;j<ch.length;j++) {
			if(ch[i]==ch[j])
				count++;
		}
		if(count<2)
			System.out.print(ch[i]);
		count=0;
	}
}
}
