package practice;
import java.util.*;
public class StringExpand {
	static Scanner s = new Scanner(System.in);    
	public static void main(String[]args) {
		 
	
	
}




static void prime() {
		System.out.println("Enter the range: ");
		int range = s.nextInt();
		int i=0;
		for(int no=2; no<=range; no++) {
			for(i=2; i<=Math.sqrt(no); i++) 
			   if(no%i==0 && no!=i) 
				     break;
			   if(i>Math.sqrt(no))
			         System.out.print(no+" ");
			   }}
		
		
		
		
		
		
		
	
	
	private static void StringExpand() {
	System.out.print("Enter The String: ");       
	String str = s.next();
    int count=0;
    for(int i=0; i<str.length(); i++) {           
    	if(Character.isDigit(str.charAt(i))) {
    	   count = count*10+Character.getNumericValue(str.charAt(i));}
    	if(Character.isAlphabetic(str.charAt(i))) {
    		print(str.charAt(i), count);
    	    count=0;}}}
	
	private static void print(char character, int counts) {
		for(int i=0; i<counts; i++) 
			System.out.print(character);}}
