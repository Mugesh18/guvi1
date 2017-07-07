import java.util.Scanner;

public class Pro52 {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int[] a=new int[2];
	int[] b=new int[2];
	int[] c=new int[2];
	int[] d=new int[2];
	for(int i=0;i<2;i++)
	{
		a[i]=sc.nextInt();
		b[i]=sc.nextInt();
		c[i]=sc.nextInt();
		d[i]=sc.nextInt();
	}
	int e=0,f=0,g=0,h=0;
	for(int i=0;i<2;i++)
	{
		e+=a[i];
		f+=b[i];
		g+=c[i];
		h+=d[i];
	}
	if(e-f==h-g)
	{
		System.out.println("Square");
	}
	else
	{
		System.out.println("Not a Square");
	}
}
}
