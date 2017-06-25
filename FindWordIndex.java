import java.util.Arrays;
import java.util.Scanner;


public class FindWordIndex {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of SStrings u need :");
		int num=sc.nextInt();
		String[] a=new String[num];
		System.out.println("Enter the words :");
		for(int  i=0;i<num;i++)
		{
			a[i]=sc.nextLine();
		}
		Arrays.sort(a);
		String[] b=new String[num];
		int k=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[k++]=a[i];
		}
		System.out.println("Enter the word that u want to find :");
		String c=sc.next();
		for(int i=0;i<b.length;i++)
		{
			if(c.equalsIgnoreCase(b[i]))
			{
				System.out.println(i);
			}
			
		}System.out.println("There is no word like"+c);
	}
}
