package guvi;
public class Hunter45 {
public static void main(String[] args) {
	String[] s={"al","al","f","bg","bg"};
	System.out.println(s.length);
	String s1="";
	for(int i=0;i<s.length;i++) {
		int count=0;
		for(int j=i+1;j<s.length;j++) {
			if((s[i].equals(s[j])))
			{
				s[i]="";
				s[j]="";
				count++;
			}
		}
		if(count<1) {
			System.out.println(s[i]);
		}
	}
}
}
