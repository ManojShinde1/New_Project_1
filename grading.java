import java.util.Scanner;

public class grading {

	public static void main(String[] args) {
		int per;
		
//		Accept a input from the user
		System.out.println("Enter the percentage");
        Scanner sc=new Scanner(System.in);
        per=sc.nextInt();
        
//        IF Condition
		if(per> 0 && per <= 25) {
			System.out.println("Your Grade is F");
		} 
		
		else if(per > 25 && per <= 50) {
			System.out.println("Your Grade is E");
		} 
		
		else if(per > 50 && per <= 60) {
			System.out.println("Your Grade is D");
		}
		
		else if(per > 60 && per <= 70) {
		System.out.println("Your Grade is C");
		}
		
		else if(per > 70 && per <= 80) {
		System.out.println("Your Grade is B");
		}
		
		else if(per > 80 && per <= 100) {
		System.out.println("Your Grade is A");
		}
	 }
 }

