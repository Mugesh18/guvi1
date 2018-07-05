import java.util.Scanner;

public class SquareValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any value to find it is a factorial no. or not : ");
		int n=sc.nextInt();
		int b=1;
		int a;
		for(int i=1;i<=n;i++) {
			a=b*i;
			b=a;
			
			if(b==n) {
				System.out.print("It is in a factorial "+i);
				break;
			}
			else if(b>n){
				System.out.print("It is not in a factorial");
				break;
		}
		}
	}

}
