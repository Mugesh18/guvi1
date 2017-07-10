import java.util.Scanner;
	public class Pro69 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mixed Values : ");
		String s=sc.nextLine();
		String str="";
		int[] b=new int[s.length()];
		char[] a=s.toCharArray();
		int max=-9999;
		int min=9999;
		for(int i=0;i<s.length();i++)
		{
			if(a[i]>='0' && a[i]<='9')
			{
				b[i]=(char)a[i];
			}
		}
		for(int i=0;i<s.length();i++)
		{
			if(b[i]!=0)
			{
				str+=""+a[i];
			}
		}
		int t=Integer.parseInt(str);
		int max1=0;
		int min1=0;
		int temp=t;
		int temp4=t;
		int temp2=t;
		while(temp>0)
		{
			int temp1=temp%10;
			if(temp1>max)
			{
				max1=temp1;
				max=max1;
			}
			temp/=10;
		}
		while(temp2>0)
		{
			int temp3=temp2%10;
			if(temp3<min)
			{
				min1=temp3;
				min=min1;
			}
			temp2/=10;
		}
		System.out.println("Minimum Value is : "+min+"\nMAxmium Value is:  "+max);
		int sum=0;
		while(t>0)
		{
			int temp3=t%10;
			sum=sum+(temp3*max);
			t/=10;
			
		}
		System.out.println("The SUm of Maxmium Value is : "+sum);
		int sum1=0;
		while(temp4>0)
		{
			int temp3=temp4%10;
			sum1+=temp3*min;
			temp4/=10;
		}
		System.out.println("The Sum of the Minimum Values : "+sum1);
		int sum2=0;
		while(sum>0)
			{
				int temp3=sum%10;
				sum2+=temp3;
				sum/=10;
			}
			int sum3=0;
			int s1=0;
			if(sum2>9)
			{
				while(sum2>0)
				{
					int temp3=sum2%10;
					sum3+=temp3;
					sum2/=10;
				}
				s1=sum3;
				System.out.println("The roundup value of maximum value is : "+sum3);
			}
			int sum4=0;
			while(sum1>0)
			{
				int temp3=sum1%10;
				sum4+=temp3;
				sum1/=10;
			}
		int s2=sum4;
		System.out.println("The roundup value of minimum value is : "+s2);
			int sum5=0;
			if(sum4>9)
			{
				while(sum4>0)
				{
					int temp3=sum4%10;
					sum5+=temp3;
					sum4/=10;
				}
				s2=sum5;
				System.out.println("The roundup value of minimum value is : "+s2);
			}
			double square;
			if(s1>s2)
			{
				 square=sum5*sum5;
			}
			else
			{
				 square=sum3*sum3;
			}
			System.out.println("The Square of the Smallest Digit is : "+square);
	}
}
	
