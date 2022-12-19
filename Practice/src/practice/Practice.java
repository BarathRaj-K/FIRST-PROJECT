package practice;
import java.util.Scanner;
public class Practice {
    static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {  
		System.out.println("Enter the String: ");
		String str = s.nextLine();
		for(int i=0; i<str.length()*2; i++) {
			for(int j=0; j<str.length(); j++) {
				if(i==j||(i+j+1)==str.length())
					System.out.print(str.charAt(j));
				else
					System.out.print(" ");
			} System.out.println();}
		}
		
		
	
		
		
		
		
	   		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	

	 static void maxSubarraySum(int arr[], int n){
	        int maxSum = Integer.MIN_VALUE;
			int sum = 0;
			for (int i = 0; i < n; ++i) {
				System.out.println("Max sum :  "+maxSum);
				System.out.println("Sum :  "+sum);
				sum += arr[i];      //3
				if (sum > maxSum)
					maxSum = sum;
				if (sum < 0)
					sum = 0;

			}
			System.out.println("Max sum :  "+maxSum);
			System.out.println("Sum :  "+sum);
       System.out.println(maxSum);}





}






