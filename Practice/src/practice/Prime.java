package practice;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the range: ");
    int range = s.nextInt();
    int dr=digit(range);
    int count=0;
   
    for(int number=2; number<=range; number++) {
    	boolean value = true;
    	for(int i=2; i<=Math.sqrt(number); i++) { 
    		if(i!=number)
    			if(number%i==0){value = false;}}
    		if(value==true) {
    			count++;
    			int nd= digit(number);
    			for(int i=nd; i<dr-1; i++) {System.out.print(0);}
    			System.out.print(number+ " ");
    			if(count%20==0) {System.out.println();}}}

}
	
static int digit(int num) {
	int d=0;
	while(num>0) {
		d++;
		num/=10;}return d;}

}
