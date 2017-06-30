
public class LP1 {
	public static int output1;
	public static void main( String [] args ) {
		userMethod(1234);
		System.out.println( output1 ); 
	}
	public static void userMethod( int input1 ) {
		int sum=0;
		while(input1>0)
		{
			int temp=input1;
			while(temp>0)
			{
				sum+=temp%10;
				temp/=10;
			}
			input1/=10;
		}
		
		output1=sum; // assign the output value at the end
	}
}