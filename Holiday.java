import java.util.Scanner;
public class Holiday {
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		String sc=s.nextLine();
		if((sc.equalsIgnoreCase("Saturday") || sc.equalsIgnoreCase("Sat") ))
		{
			System.out.println(sc+"=False");
		}
		else if(sc.equalsIgnoreCase("Sunday")|| sc.equalsIgnoreCase("Sun"))
		{
			System.out.println(sc+"=False");
		}
		if((sc.equalsIgnoreCase("Monday") || sc.equalsIgnoreCase("mon") ))
		{
			System.out.println(sc+"=True");
		}
		else if(sc.equalsIgnoreCase("tuesday")|| sc.equalsIgnoreCase("tue"))
		{
			System.out.println(sc+"=True");
		}
		if((sc.equalsIgnoreCase("wednesday") || sc.equalsIgnoreCase("wed") ))
		{
			System.out.println(sc+"=True");
		}
		else if(sc.equalsIgnoreCase("thursday")|| sc.equalsIgnoreCase("thu"))
		{
			System.out.println(sc+"=True");
		}
		if((sc.equalsIgnoreCase("friday") || sc.equalsIgnoreCase("fri") ))
		{
			System.out.println(sc+"=True");
		}
		else
		{
			System.out.println(sc+"=Invalid Input");
		}
			
		
	}
}
