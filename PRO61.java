import java.util.Scanner;

public class PRO61 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	for(int i=0;i<s1.length();i++)
	{
		int a=(int)s1.charAt(i)+10;
		System.out.print((char)a);
	}
	System.out.println(" ");
	for(int i=0;i<s2.length()-1;i++)
	{	
		if(i==0)
		{
		System.out.print(s2.charAt(i));
		}
		else if(i!=0 && ((int)s2.charAt(i)+10)>=96 && ((int)s2.charAt(i)+10<=122))
		{
			int b=(int)s2.charAt(i)+10;
			System.out.print((char)b);
		}
		else
		{
			int b=(int)s2.charAt(i)-122;
			int c=b+96+10;
			System.out.print((char)c);
		}
	}
	System.out.println(s2.substring(s2.length()-1,s2.length()));
	
}
}
