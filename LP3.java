
public class LP3 {
	public static int output1;
	public static void main( String [] args ) {
	userMethod( 1234 ); //Test Cases
	System.out.println( output1 ); //Check the output value
	}
	public static void userMethod( int input1 ) {
		int count = 0;
		int temp=0;
		int temp1=input1;
		//int a=input1;	
		int sum=0;
	while(input1>0) {
		temp=input1%10;
		input1/=10;
		count++;
	}
	//int c=count;
	System.out.println(count);
	while(temp1>0)
	{
			int n=temp1%10;
			sum+=Math.pow(n,count);
			temp1/=10;
	}
		output1=sum;
		}
}
