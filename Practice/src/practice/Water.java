package practice;
import java.util.*;
public class Water {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[]= new int[100];
		while(true) {
		System.out.print("Enter the Values(0 to stop): ");
		for(int i=0; i<100; i++) {
			arr[i]=s.nextInt(); if(arr[i]==0) break;}
		maxwater(arr);}}
		
		static void maxwater(int arr[]) {
		 char list[][] = new char[max(arr)][arr.length];
		 for(int i=0; i<max(arr); i++) 
			   for(int j=0; j<arr.length; j++) {
				   if(arr[j]>i)list[i][j]='O';
				   else list[i][j]=' ';}
		int frst=0;
		int sum=0;
		for(int i=0; i<arr.length; i++) {
		     if(arr[i]>=arr[frst]) {
 		          for(int j=frst+1; j<i; j++) {
 		        	 for(int k=arr[j]+1; k<=Math.min(arr[i], arr[frst]); k++)
 		        		 list[k-1][j]='#';
				     sum+=Math.min(arr[i], arr[frst])-arr[j];}
		             frst=i;}
		if(i==arr.length-1&&frst!=i) {
			arr[frst]=--arr[frst];
			i=frst;}}
		System.out.println("Maximum water : "+sum+" sq");
		print(list);}

   static int max(int arr[]) {
	   int maximum = Integer.MIN_VALUE;
	   for(int i=0; i<arr.length; i++) 
		   if(arr[i]>maximum)
			   maximum= arr[i];
	   return maximum;}
   
   static void print(char[][]arr) {
	       System.out.println("You can also visualize: \n");
	       for(int i=arr.length-1; i>=0; i-- ) {
	    	   for(int j=0; j<arr[i].length; j++) {
			   System.out.print("   "+ arr[i][j]+" ");
		   }System.out.println("\n");}
	       System.out.println("\n o --->>>blocks\n # --->>>water\n");
   }}
