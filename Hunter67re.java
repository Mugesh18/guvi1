package guvi;

import java.util.ArrayList;
import java.util.Scanner;

public class Hunter67 {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int max=-999999;
	String name="";
	for(int i=0;i<n;i++) {
		System.out.println("Enter the Student "+(i+1)+" name and marks : ");
		al.add(sc.next());
		String[] b=al.get(i).split("#");
		String str1=b[0];
		int add=Integer.parseInt(b[1])+Integer.parseInt(b[2])+Integer.parseInt(b[3]);
		System.out.println(add);
		if(add>max) {
			max=add;
			name=b[0];
		}
		else {
			System.out.println("Both are Equal");
		}

	}
	System.out.println("The name of the Student who scored max : "+name);
	}
}
