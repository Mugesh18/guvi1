import java.util.Scanner;
public class OddReturn {
	public static void main(String[] args){
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		int b,s=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<a.length;j++)
		{
			if(a[j]%2!=0)
			{
				b=s+a[j];
				s=b;
			}
			
		}System.out.println("Added odd value is: "+s);
			if(s%2!=0)
			{
				System.out.println("1");
			}
			else 			{
				System.out.println("-1");
			}
		}
	}


