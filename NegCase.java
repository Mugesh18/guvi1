import java.util.Scanner;


public class NegCase {
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=Integer.parseInt(s);
		if(n<0)
		{
			System.out.println(Math.abs(n));
		}
		else
		{String str=Integer.toString(n);
		char c=str.charAt(0);
		int ascii=(int) c;
		if(c<=126 && c>=33){
			
			System.out.println("-1");
		}
		
	}
}}
