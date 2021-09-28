import java.util.*;

public class atmpass {

	public static void main(String[] args) {

		Scanner cs = new Scanner(System.in);
		
		boolean flag = false;
		
		for(int i = 0 ; i <= 2; i++) {
			System.out.println("Enter your password : ");
			int pass = cs.nextInt();
			if(pass == 1234) {
				flag = true;
				break;
			}
		}
		
		if(flag == true ) {
			System.out.println("Password is Accepted");
		}else 
			System.out.println("Your Card is Blocked");

	}
}