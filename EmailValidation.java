/* Welcome to the Email Validation Problem */

import java.util.*;

public class ValidateEmail {
	public static void main(String[] args) public static void main(String[] args) {
		System.out.println("Welcome to the Email Validation Problem");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email pattern to be validated");
		String patternValidate = sc.next();
		boolean matcher = patternValidate.matches( "^[a-zA-Z0-9]{1,}[-+._][a-zA-Z0-9]{0,}@[a-zA-Z]{1,}.[a-zA-Z]{1,}.[a-zA-Z]*");

		if(matcher == true) {
			System.out.println("patternValidate"+" matches the Email Format");
		}else {
			System.out.println("patternValidate"+" does not match the Format");
		}

	}
}