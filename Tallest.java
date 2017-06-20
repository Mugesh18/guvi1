import java.util.Scanner;


public class Tallest {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 int temp;
		 int max1=-1234,max2=-1234,max3=-1234,max4=-1234;
		 int a[]=new int[n];
		 for(int k=0;k<n;k++)
		 {
			 a[k]=s.nextInt();
		 }for(int i=0;i<n;i++){
			 System.out.println(a[i]);

		 }
		 for(int i=0;i<n;i++){
			 for(int j=i+1;j<n;j++)
			 {
				 if(a[i]<a[j])
				 {
					 temp=a[j];
					 a[j]=a[i];
					 a[i]=temp;
				 }
			 }}
		 for(int i=0;i<n;i++)
		 {
			 if(a[i]>max1)
			 {
				 max1=a[i];
			 }
		 }
		 for(int i=0;i<n;i++)
		 {
			 if(a[i]>max2&&a[i]<max1)
			 {
				 max2=a[i];
			 }
		 }
		 for(int i=0;i<n;i++)
		 {
			 if(a[i]>max3&&a[i]<max2)
			 {
				 max3=a[i];
			 }
		 }
		 for(int i=0;i<n;i++)
		 {
			 if(a[i]>max4&&a[i]<max3)
			 {
			max4=a[i];
			 }
		 }
		 for(int l=0;l<n;l++)
		 {
			 System.out.print("  "+a[l]);
		 }
		 System.out.println("\n");
		 System.out.println("The maximum of 4th Tallest is :"+max4);
			 int b=s.nextInt();
			 for(int i=b-1;i<=n;i++)
			 {	
			 		System.out.println(a[i]);
			 		break;
			 	}
	 }
	 }
