import java.util.Scanner;
public class Pyramid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int k=0;k<n%2;k++)
		{
			System.out.println(" ");
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++)
			{//System.out.println(" ");
				System.out.print(j);
			}
			System.out.println();
		}
	}
	}
}
