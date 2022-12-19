package practice;
public class Zoho2Round {
	public static void main(String[] args) {
		value();
    	 
	}
	
	
	
	
	static void value() {
		int n = 24135;
		String no = Integer.toString(n);
		int odd=0;
		int even=0;
		for(int i=0; i<no.length(); i++ ) {

			if(Character.getNumericValue(no.charAt(i))%2==0){
				even*=10;
				even+=Character.getNumericValue(no.charAt(i));}
		    if(Character.getNumericValue(no.charAt(i))%2==1) {
		    	odd*=10;
			    odd+=Character.getNumericValue(no.charAt(i));}}
	System.out.println(odd+"  "+even+"  "+(odd+even));
	
	}
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	static void reverceString() {
		int stop=0;
		String s = "barath raj k";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' ' || i==s.length()-1) {
				for(int j=i; j>=stop; j--) 
					System.out.print(s.charAt(j));
			    stop=i;}}}
	
	
	static void avg() {
		int sum=0;
		for(int i=1; i<=30; i++) {
			if(i%7==1)
				sum+=510;
			else
				sum+=240;}
		System.out.println(sum/30);}
	
	static void least() {
		for(int i=3; 2<3; i+=3) {
			int num = 2*i;
			if(num%12==0 && num%18==0 && num%21==0 && num%30==0) {
				System.out.println(i);
				return;}}}
	
	
	
	
	
	
	
	
	
	
  static void grandChild(String name) {
	  String arr[][]= new String[5][2];
	  arr[0][0]="prasanna";   arr[0][1]="mouni";
      arr[1][0]="barath";     arr[1][1]="kanagaraj";
      arr[2][0]="kanagaraj";  arr[2][1]="eswaran";
      arr[3][0]="mouni";      arr[3][1]="kanagaraj" ;
      arr[4][0]="lekh";      arr[4][1]="kanagaraj" ;
      int gdChild=0;
      for(int i=0; i<arr.length; i++) {
    	  if(arr[i][1].equals(name)) {
    		  String son=arr[i][0];
    		  for(int j=0; j<arr.length; j++) 
    	    	  if(arr[j][1].equals(son)) gdChild++;}}
    	  System.out.println(gdChild);}
    	  	  
	  
	  
  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
static void asecdesc() {
    int arr[]= new int[] {0,1,2,3,4,5,6,7,8,9};
    for(int i=1; i<=arr.length; i++) {
   	 System.out.println("  ");
   	 if(i%2==1)
   		 System.out.print(arr[i]);
   	 else
   		 System.out.print(arr.length-i);}}
}