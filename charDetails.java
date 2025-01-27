package chardetail;

import java.util.Scanner;

public class charDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char ch = scanner.next().charAt(5);
		int unicodeValue = (int) ch;
		
		System.out.println("Unicode vale:" + unicodeValue);
		
		if (Character.isLetter(ch)) {
            System.out.println("It's a letter.");
        } else if (Character.isDigit(ch)) {
            System.out.println("It's a digit.");
        }
	}

}
