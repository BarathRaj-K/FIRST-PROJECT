package practice;
import java.util.*;
public class Month {
	public static void main(String[] args) {month();}
	static void month() {
	    int yr = scan("Enter the yr: ");
	    int month = scan("Enter the month: ");
	    int leap=0;
	    if(yr%4==0)
	    	leap=1;
	    if(month==1) System.out.println("jan days:"+31);
	    if(month==2) System.out.println("feb days:"+(28+leap));
	    if(month==3) System.out.println("mar days:"+31);
	    if(month==4) System.out.println("apr days:"+30);
	    if(month==5) System.out.println("may days:"+31);
	    if(month==6) System.out.println("jun days:"+30);
	    if(month==7) System.out.println("jul days:"+31);
	    if(month==8) System.out.println("aug days:"+31);
	    if(month==9) System.out.println("sep days:"+30);
	    if(month==10) System.out.println("oct days:"+31);
	    if(month==11) System.out.println("nov days:"+30);
	    if(month==12) System.out.println("dec days:"+31);}
	
	static int scan(String str) {
		Scanner s = new Scanner(System.in);
		System.out.print(str);
		return s.nextInt();}}