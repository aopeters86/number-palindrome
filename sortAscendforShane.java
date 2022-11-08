import java.util.Arrays;
import java.util.Scanner;
public class sortAscendforShane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nShane said this programs gotta do something, so, heres my attempt at a sorting loop.\n \nEnter 3 numbers, each individually. Press enter between each number\n");
		System.out.println("Enter your first number: ");
		int inp1 = input.nextInt();
		System.out.println("Enter your second number: ");
		int inp2 = input.nextInt();
		System.out.println("Enter your third number: ");
		int inp3 = input.nextInt();
		
		int num1 = inp1, num2 = inp2, num3 = inp3;
		
		int [] array = new int[]{ num1, num2, num3};
		Arrays.sort(array);
		
		System.out.println("Shane's sorted numbers are: ");
		for(int i =0;i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		
		
		
		
	}

}
