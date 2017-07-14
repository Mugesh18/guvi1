package guvi;

import java.util.Scanner;

public class Hunter47 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int max=0;
	int count1=0;
	int count2=0;
	int count3=0;
	String max1="";
	String s=sc.nextLine();
	String s1=s.replace("."," ");
	String s2=s.replace(" ","");
	String[] s3=s1.split(" ");
	for(int i=0;i<s3.length;i++)
	{
		int len=s3[i].length();
		if(len>max)
		{
			max=len;
			max1=s3[i];
		}
	}
	System.out.println("Removed white Spaces : "+s2);
	System.out.println("Length is : "+max+" and the Corresponding word is :"+max1);
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='e')
		{
			count1++;
		}
		else if(s.charAt(i)-48>=0 && s.charAt(i)-48<=9)
		{
			count2++;
		}
		if(s.charAt(i)=='.' || i==s3.length) {
			count3++;
		}
	}
	System.out.println("Total no.of e in the given Input is : "+count1);
	System.out.println("Total no.of numbers in the given Input is : "+count2);
	System.out.println("The total no.of Words in a string is : "+s3.length);
	System.out.println("The total no of sentences in a string is : "+count3);
}
}
