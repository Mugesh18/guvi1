import java.util.Scanner;
public class FindNoOf2Hunter85 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp;
		int count=0;
		for(int i=0;i<n;i++){
			temp=i;
		while(temp>0){
			int rem=temp%10;
			if(rem==2){
				count++;
			}
			temp=temp/10;
		}
		}System.out.println(count);
	
	}

}
