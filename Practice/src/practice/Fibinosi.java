package practice;
import java.util.*;
public class Fibinosi {
	public static void main(String[] args) {
        
		
		
	}
	
    static void fibonaaci(int a,int b, int count) {
    	int sum=a+b;
    	System.out.println(a);
    	if(count==1)
    		return;
    	fibonaaci(b,sum,count-1);
    }
    public static int findMissing(int arr[]) {
		int len=arr.length;
		int total= (len+2)*((len+1)/2);
		for(int i=0; i<arr.length; i++) 
			total-=arr[i];
		return total;}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	void divid() {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Number: ");
	int num=s.nextInt();
	System.out.println("Enter the Diviser: ");
	int div = s.nextInt();
	int sign=1; int count=0;
	if(div<0) {
		sign = -sign;
		div=-div;}
	if(num<0) {
		sign = -sign;
	    num=-num;}
	while(num>=div) {
		num-=div;
		count++;}
	if(sign<0)
		count=-count;
	System.out.println(count);
	}
	
  static int s(String str) {
	  Scanner s = new Scanner(System.in);
	  System.out.println(str);
	  return s.nextInt();}

}