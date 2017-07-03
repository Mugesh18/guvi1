import java.util.Scanner;


public class OddWordReverrse72 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		String s2="";
		for(int i=0;i<s1.length;i++)
		{
			if(i%2==1)
			{
				System.out.println(" "+s1[i]);
			}
			else
				{
				StringBuffer s3=new StringBuffer(s1[i]);
				System.out.println(s3.reverse());
				}
			}
		
	}
}
