import java.util.Scanner;

public class Pro21 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Array size : ");
	int n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("Enter the array values : ");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	String str="";
	String str1="";
	int b=a.length/2;
	if(n%2==0)
	{
		for(int i=0;i<b;i++)
		{
			str+=a[i];
		}
		for(int j=b;j<a.length;j++)
		{
			str1+=a[j];
		}
	}
	else
	{
		for(int i=0;i<b+1;i++)
		{
			str+=a[i];
		}
		for(int j=b+1;j<a.length;j++)
		{
			str1+=a[j];
		}
	}
	int count1=1,count2=1;
	int c=Integer.parseInt(str);
	int d=Integer.parseInt(str1);
	int temp=c;
	int temp1=d;
	while(c>0)
	{
		int que=c%10;
		count1++;
		c=c/10;
	}
	for(int i=0;i<str1.length();i++)
	{
		count2++;
	}
	
	int sum1=0;
	int sum2=0;
	while(temp>0)
	{
		int rem=temp%10;
		sum1=rem+sum1;
		temp=temp/10;
		
	}
	while(temp1>0)
	{
		int rem1=temp1%10;
		sum2+=rem1;
		temp1/=10;
	}
	float total1=(sum1/count1);
	float total2=(sum2/count2);
	if(total1==total2)
	{
		if(n%2==0)
		{
			System.out.print("[");
			for(int i=0;i<b;i++)
			{
				System.out.print(a[i]);
				if(i<b-1)
				{
					System.out.print(",");
				}
			}
			System.out.print("]");
			System.out.print("[");
			for(int j=b;j<a.length;j++)
			{
				System.out.print(a[j]);
				if(j<a.length-1)
				{
					System.out.print(",");
				}
			}
			System.out.print("]");
			
		}
		else
		{
			System.out.print("[");
			for(int i=0;i<b+1;i++)
			{
				System.out.print(a[i]);
				if(i<b)
				{
					System.out.print(",");
				}
			}
			System.out.print("]");
			System.out.print(",");
			System.out.print("[");
			for(int j=b+1;j<a.length;j++)
			{
				System.out.print(a[j]);
				if(j<a.length-1)
				{
					System.out.print(",");
				}
			}
			System.out.print("]");
			
		}
	}
	else
	{
		System.out.println("Not Possible");
	}
}

}

