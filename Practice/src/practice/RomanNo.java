package practice;
public class RomanNo {

	public static void main(String[] args) {
		System.out.println(roman(950));
	
	}
		
		

	
	static String roman(int val) {
		String no="";
		while(val>=1000) {
			no+="M"; val-=1000;}
		if(val>=900) {
			no+="CM"; val-=900;}
		if(val>=500) {
			no+="D"; val-=500;}
		while(val>=100) {
			no+="C"; val-=100;}
		if(val>=90) {
			no+="XC"; val-=90;}
		if(val>=50) {
			no+="L"; val-=50;}
		while(val>=10) {
			no+="X"; val-=10;}
		if(val==9) {
			no+="IX"; return no;}
		if(val>=5) {
			no+="V";val-=5;}
		while(val>=1) {
			no+="I"; val-=1;}
		return no;}
	}

