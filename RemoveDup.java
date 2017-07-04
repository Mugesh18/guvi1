import java.util.Scanner;
public class RemoveDup {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	char[] a=s.toCharArray();
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				a[j]=0;
			}
			
		}
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]!=0)
		{
			System.out.print(a[i]);
		}
	}
}
}
