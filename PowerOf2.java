import java.util.Scanner;


public class PowerOf2 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int i=2;
			while(i<1000)
			{
				if(Math.pow(2,i)==a)
				{
					System.out.println(a+" is a power of 2");
					break;
				}
				i++;
				
				
			}
			
	}
		
	}

