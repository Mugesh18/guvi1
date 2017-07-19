package guvi;

import java.util.Scanner;

public class Hunter90 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String s1=shuffle(s);
	int count=0;
	int count1=0;
	if(s1.length()==1) {
		count++;
		}
	System.out.println(s1);
	if(s1.length()>2) {
	for(int i=0;i<s.length();i++) {
		for(int j=0;j<s1.length();j++) {
			if(s1.length()>2) {
				if(s.charAt(i)==s1.charAt(j)) {
				if(i!=j)
					count++;
			}
		}
			if(s1.length()==2) {
						if(s.charAt(i)==s.charAt(j)) {
							if(i!=j) 
								count1++;
							}
						}
					}			
				}
			}	
	
	if(count==s1.length() || count1==s1.length()) 
		System.out.println("valid");
	else
		System.out.println("invalid");
	
}
	static String shuffle(String s){
        if (s.length()<=1)
            return s;

        int split=s.length()/2;

        String temp1=shuffle(s.substring(0,split));
        String temp2=shuffle(s.substring(split));

        if (Math.random() > 0.5) 
            return temp1 + temp2;
        else
            return temp2 + temp1;
    }
}

