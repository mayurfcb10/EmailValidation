/* Welcome to the Email Validation Problem */

import java.util.*;

public class EmailValidation {
	public static void main(String[] args) {
		System.out.println("Welcome to the Email Validation Problem");
		Scanner sc = new Scanner(System.in);
		String patternValidate = sc.next();
		boolean matcher = patternValidate.matches("@[A-Za-z]+");

		if(matcher == true) {
			System.out.println(patternValidate+" matches the Email Format");
		}else {
			System.out.println(patternValidate+" does not match.Invalid Format");
		}

	}

}