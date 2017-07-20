package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class Hunter1 {
public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
      System.out.println("Enter the length of the array:");
      int n=s.nextInt();
      int ar[]=new int[n];
      int count=0;
      int c=0;
      System.out.println("Enter the array elements :");
      for(int i=0;i<n;i++)
          ar[i]=s.nextInt();
      int a[]=new int[n];
     for(int j=0;j<n;j++) {
    	 for(int i=j;i<n;i++) {
    		 if(ar[j]==ar[i]) {
    			 a[i]=ar[i];
    		 }
		 }
     }
     System.out.println("The Repeated Numbers are : ");
     for(int i=0;i<n;i++) {
    	 if(a[i] != 0) 
    		System.out.println(a[i]);
     }
}
}
