import java.util.Scanner;

public class greaterThree {

	public static void main(String[] args) {
		
//		Accept input from the user
		System.out.println("Enter first number : ");
		Scanner num1 = new Scanner(System.in);
		int num = num1.nextInt();
		
		System.out.println("Enter second number : ");
		Scanner num2 = new Scanner(System.in);
		int num3 = num2.nextInt();
		
		System.out.println("Enter third number : ");
		Scanner num4 = new Scanner(System.in);
		int num5 = num4.nextInt(); 
		
//		IF Condition
		if(num > num3) {
			System.out.println("A greater number is : " + num);
			}else if(num3 > num5) {
				System.out.println("A greater number is : " + num3);
			}else {
				System.out.println("A greater number is : " + num5);
			}
	}

}
