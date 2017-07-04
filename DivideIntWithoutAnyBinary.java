import java.util.Scanner;
public class DivideIntWithoutAnyBinary {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=Math.abs(sc.nextInt());
	int quotient=0;
	while(a>=b)
	{
		a-=b;
		quotient++;
	}
	System.out.println("Quotient Is : "+quotient+"\nRemainder is : "+a);
}
}
