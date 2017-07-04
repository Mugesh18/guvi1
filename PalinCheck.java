import java.util.Scanner;
public class PalinCheck {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	for(int i=0;i<s.length();i++)
	{	String s3=new StringBuffer(s).reverse().toString();
		if(s3.equalsIgnoreCase(s))
		{
			System.out.println(s+" is a Palindrome");
			break;
		}
		else{
		String s1=s.substring(0,i)+s.substring(i+1,s.length());
		String s2=new StringBuffer(s1).reverse().toString();
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.print(s1+" Is a palindrome\n");
			System.out.println("index Value is : "+i+"\nIndex Letter is : "+s.charAt(i));
		}
		}
		
	}
}
}
