package practice;
import  java.util.*;
public class Zoho {
	
	
	
	
	public static void main(String[]args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a String: ");
	String str = s.next();
	StringPrint(str);
	}
	
	
    public static void StringPrint(String str) {
    	char c =' ';
    	for(int i=0; i<str.length(); i++) {
    		if(Character.isAlphabetic(str.charAt(i))) { c=str.charAt(i);}
    		if(Character.isDigit(str.charAt(i))) { 
    			String num = "";
    			int j=i;
    			while(j<str.length()&&Character.isDigit(str.charAt(j))) {
    			if(num==""&&str.charAt(j)=='0') {num+="";}
    			else{num += str.charAt(j);}
    		    j++;}
    		    int n= Integer.parseInt(num);
    			for(int k=0; k<n; k++) {
    				System.out.print(c);} i=j-1;}}}
     
}
