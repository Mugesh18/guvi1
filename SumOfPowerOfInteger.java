import java.util.Scanner;


public class SumOfPowerOfInteger {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	int reverse=0;
	int len=String.valueOf(n).length();
	for(int i=0;i<len;i++)
	{
			int rem=n%10;
			reverse=reverse*10+rem;
			n/=10;
	}
	
	for(int i=0;i<len;i++)
	{
		int rem=reverse%10;
		sum=sum+(int)(Math.pow(rem,i));
		reverse/=10;
		}
	
	System.out.println(sum);
	}
}

