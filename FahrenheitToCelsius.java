import java.util.Scanner;
public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//Prompt for degree F
		System.out.println("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		input.close();
		
		//Do math as a variable
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		
		System.out.println(fahrenheit + " degrees Fahrenheit is  " + celsius + " Degrees Celsius.");
		
	}

}

