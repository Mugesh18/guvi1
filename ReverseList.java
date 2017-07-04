import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class ReverseList {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<String> l=new ArrayList<String>();
	l.add("mugesh");
	l.add("Kumar");
	System.out.println("Before Reversing the String : "+l);
	Collections.reverse(l);
	System.out.println("After Reversing the String : "+l);
}
}
