/* Welcome to the Email Validation Problem */
import java.util.*;

public class EmailValidation {
	public static void main(String[] args) {
		System.out.println("Welcome to the Email Validation Problem");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email pattern to be validated");
		String patternValidate = sc.next();
		boolean matcher = patternValidate.matches("[A-Za-z0-9]+");


		if(matcher == true) {
			System.out.println(patternValidate+" Matches the Email Format");
		}else {
			System.out.println(patternValidate+" does not Match the Email Format");
		}

	}
}