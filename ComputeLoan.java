import java.util.Scanner;
public class ComputeLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//prompt user for interest rate
		System.out.println("Enter annual interest rate e.g., 7.25: ");
		double annualInterestRate = input.nextDouble();
		
		//establish monthly interest rate annual / 1200
		double monthlyInterestRate = annualInterestRate / 1200;
		
		//prompt for number of years
		System.out.println("Enter number of years as an integer: ");
		int numberOfYears = input.nextInt();
		
		//Enter loan amount
		System.out.println("Enter loan amount as an integer e.g., 120000.95: ");
		double loanAmount = input.nextDouble();

		//calculate payment 
		//monthly
		double monthlyPayment = loanAmount * monthlyInterestRate / 
				(1-1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		//total
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		System.out.println("Enter down payment amount as an integer e.g., 120000: ");
		double downPayment = input.nextDouble();
		double downPaymentTotal = totalPayment - downPayment;
		
		//Display Results
		//monthly payment
		System.out.println("The monthly payment is $ " + (int)(monthlyPayment * 100) / 100.0);
		//total payment
		System.out.println("The total payment is $ " + (int)(totalPayment * 100) /100.0);
		//total payment with downpayment
		//System.out.println("Your total payment with " + (int)(downPayment *100) / 100.0) +  " down is " + (int)((totalPayment * 100) /100.0) - (downPayment);
		
		//Figure this out sometime
		//monthly interest payment
		//System.out.println("Your montly interest payment is " + monthlyInterestRate);	
		
		
	}

}
