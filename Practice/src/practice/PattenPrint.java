package practice;
import java.util.*;

public  class PattenPrint {
	 private static Scanner s  = new Scanner(System.in);
   
	 public static void main(String[]args) {
		 oddPrint();
	 }
	 
	 //1
     static  void oddPrint() {                               
		 System.out.println("Enter the odd Number: ");       
	     int n= s.nextInt();                             
		 float mid = n/2+1;                                  
		 for(int i=1; i<=n; i++) {                           
			for(int j=1; j<=n; j++) {                        
				float check = (float)(i+j)/2;
				if(i==j) {
					if(i<=mid)
						System.out.print(i);
					else
						System.out.print((int)(i-2*(i-mid)));}
				else if(check==mid) {
					if(i>=mid) 
						System.out.print(i);
					else
						System.out.print(j);}
				else
					System.out.print("  ");    }
		       System.out.println();} gap();}		
     
     
     // 2
     static void  leftTriange() {
    	 int n=INT("Enter the Size: ");
    	 for(int i=1; i<=n; i++) {
    		 for(int j=1; j<=i; j++)
    			 System.out.print(i+" ");
    		System.out.println(); }gap();}
     
     //3
     static void decreTriangle() {
    	 int n=INT("Enter the Number");
    	 for(int i=0; i<n; i++) {
    		for(int j=1; j<=(n-i); j++ )
    			System.out.print("*");
    		System.out.println();} gap();}
     
     //4
     static void rightDiamand() {
    	 int n= INT("Enter the Number: ");
    	 for(int i=1; i<=(n*2); i++) {
    		 for(int j=1; j<=i; j++) {
    			 if(i<=5)
    				 System.out.print("* ");
    			 else
    				 if(j<=i-(2*(i-n)))
    					System.out.print("* ");}
    		 System.out.println();} gap();}
     
     
     //5
     static void highLowHigh() {
    	 int n= INT("Enter any Number");
    	 for(int i=1; i<=(n*2); i++) {
    		 for(int j=1; j<=n; j++) {
    			 if(j<=n-i+1)
    				 System.out.print("* ");
    			 if(i>n)
    				 if(j<=(i-n))
    				   System.out.print("* ");}
    		 System.out.println();}gap();}
     
     //6
     static void diamandPrint() {
    	  int n=INT("Enter the odd Number: ");
    	  int mid = (n/2)+1;
    	  for(int i=0; i<n; i++) {
    		  for(int j=1; j<=n; j++) {
    			  if(i<mid-1) {
    			      if((mid-(i))<=j && j<=(mid+(i)))
    				     System.out.print("* ");
    			      else
    				     System.out.print("  ");}
    		     else {
    		    	 if(mid+(mid-(i-mid+2))>=j&&mid-(mid-(i-mid+2))<=j)
    		    		 System.out.print("* ");
    		    	 else
    		    		 System.out.print("  ");}}
    	System.out.println();}
    	gap();}
    	  
     
     //to scan
      static int INT(String str) {
    	  System.out.println(str);
    	  return s.nextInt();}
      private static void gap() {
    	  System.out.println("\n\n");}
   }
