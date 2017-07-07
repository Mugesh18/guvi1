import java.util.Scanner;

public class Pro57 {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String s1=sc.nextLine();
	if(s1.length()>2 && s.length()>2)
	for(int i=0;i<s1.length()-2;i++)
	{
		String str=s1.substring(i,i+3);
		if(s.contains(str))
		{
			System.out.println("String s Which is a SubString of s1 and the Value is : "+str);
		}
	}
	else
	{
		System.out.println("Invalid Input");
	}
	if(s1.length()>2 && s.length()>2)
	for(int i=0;i<s.length()-2;i++)
	{
		String str=s.substring(i,i+3);
		if(s.contains(str))
		{
			System.out.println("String s1 Which is a SubString of s and the Value is : "+str);
		}
	}
	else
	{
		System.out.println("Invalid Input");
	}
}
}
