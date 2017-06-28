import java.util.Scanner;


public class AsciiSum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int sum=0;
	for(int i=0;i<s.length()-1;i++)
	{
		sum+=(int)s.charAt(i+1)-(int)s.charAt(i);
	}
	int n1=sum-s.charAt(0);
	char c=(char)Math.abs(n1);
	System.out.println("Sum of "+s+" is : "+c);
}
}
