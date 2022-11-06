import java.util.Scanner;
public class DisplayTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		//Prompt for input
		
		System.out.println("Enter an integer for seconds: ");
		int seconds = input.nextInt();
		input.close();
		
		int minutes = seconds /60;//Find minutes in seconds
		
		//seconds remaining it is an int and will not show remainder
		int remainingSeconds = seconds %60; 
		
		System.out.println(seconds + " seconds is " 
		+ minutes + " minutes and " + 
				remainingSeconds + " seconds." );
		
	}

}
