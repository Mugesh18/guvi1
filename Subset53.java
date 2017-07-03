import java.util.Scanner;


public class Subset53 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String p="";
	char[] c=s.toCharArray();
	/*for(int i=0;i<c.length;i++)
	{System.out.print(c[0]);
	*/for(int  j=1;j<c.length;j++){
	//	System.out.print(c[0]);
		System.out.println(c[0]+""+c[j]);
	}
	}
}
