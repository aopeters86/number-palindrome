import java.util.Scanner;
public class PalindromeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a three digit integer: ");
		int userIn = input.nextInt();
		
		int firstDigit = userIn /100;
		int secondDigit = (userIn %100) /10;
		int thirdDigit = userIn %10;
		
		if(firstDigit == thirdDigit) {
			System.out.println(userIn + " is a number palindrome!");
		}
		
		else {
			System.out.println( userIn + " is not a palindrome");
		}		
	}

}
