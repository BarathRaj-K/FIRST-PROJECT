package knowGit;
import java.util.*;
public class Demo {
	public static void main(String[] args) {
    
    System.out.println("Enter your age: ");
    int age = new Scanner(System.in).nextInt();
    if(age>=18)
    	System.out.println("Can vote");
    else
    	System.out.println("Cant vote");
	}

}
