/* Welcome to the Email Validation Problem */

import java.util.*;

public class ValidateEmail {
	public static void main(String[] args) {
		System.out.println("Welcome to the Email Validation Problem");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email pattern to be validated");
		String patternValidate = sc.next();
		boolean matcher = patternValidate.matches("^[._+-]+[A-Za-z]+");

		if(matcher == true) {
			System.out.println(patternValidate+" matches the Email Format");
		}else {
			System.out.println(patternValidate+" does not match the Format");
		}

	}

}