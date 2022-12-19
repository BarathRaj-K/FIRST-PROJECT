package practice;
import java.util.Arrays;
import java.util.Scanner;

public class StringValue {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Special String: ");
		String eq = s.next();
		String oper="";
		int no[]=new int[20];
		for(int i=0; i<eq.length(); i++){
			if(Character.isDigit(eq.charAt(i)))
				no[oper.length()]=(no[oper.length()]*10)+Character.getNumericValue(eq.charAt(i));
			else
			   oper+=eq.charAt(i);}
		for(int i=0; i<oper.length(); i++) {
			if(oper.charAt(i)=='/')
				no[i]/no[i+1];
		}
		
		
		
		
		
		
	}}