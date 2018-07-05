import java.util.Scanner;


public class OddBetween {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a start value : ");
		
		int start=sc.nextInt();
		
		System.out.println("Enter a End Value : ");
		
		int end=sc.nextInt();
		
		for(int i=start+1;i<end;i++) {
			
			if(i%2==1)
				
				System.out.print(i+" ");
		}
		
	}
}
