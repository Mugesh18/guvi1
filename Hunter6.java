package guvi;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Hunter6 {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
			ArrayList<Integer> l=new ArrayList<Integer>();
			String str[]=sc.nextLine().split(",");
			int a[]=new int[str.length];
			
			for(int i=0;i<a.length;i++)
			{
				int temp=Integer.parseInt(str[i]);
				if(l.contains(temp))
				{
					System.out.println(temp);
					break;
				}
				else
				{
					l.add(temp);
				}
	     
}}}
