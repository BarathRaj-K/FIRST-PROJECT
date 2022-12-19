package oddEvenAsecDescPrint;
import java.util.*;
public class OddEvenAsecDescPrint {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String []args) {
		print();
	}
	 
    static  void print() {
    	 int arr[]=new int[40];
    	 System.out.println("Enter the numbers ");
    	 for(int i=0; i<20; i++) {
    		 arr[i]=s.nextInt();
    		 if(arr[i]<0) {break;}}
    	 arr=sort(arr);
    	 System.out.println(Arrays.toString(arr));
    	 
    	
     }


   static  int[] sort(int arr[]) {
	   System.out.println(Arrays.toString(arr));
	    for(int i=0; i<arr.length;i++) {
	    	for(int j=0; j<arr.length-i-1; j++) {
	    		if(arr[j]>arr[j+1]) {
	    			System.out.println("swaps");
	    			int temp = arr[j];
	    			arr[j]=arr[j+1];
	    			arr[j+1]=temp;}}}
	    System.out.println(Arrays.toString(arr));
	    return arr;}
	    	
	    
}