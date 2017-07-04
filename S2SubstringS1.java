import java.util.Scanner;
public class S2SubstringS1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	int m=s2.length();
	int p=0,flag=0;
	for(int i=0;i<s1.length();i++)
	{	
		String s3=s1.substring(i,i+m);
		if(s3.equals(s2))
		{
			p=i;
			flag=1;
			break;
		}
	}
	if(flag==1)
	{
		System.out.println(p);
	}
	else
	{
		System.out.println("-1");
	}
}
}
