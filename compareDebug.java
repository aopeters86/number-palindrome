import java.util.Scanner;
public class compareDebug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//compare some shit
		System.out.println("Enter 3 numbers to sort lowest to highest");
		System.out.println("Enter number 1: ");
		int a = input.nextInt();
		System.out.println("Enter number 2: ");
		int b = input.nextInt();
		System.out.println("Enter number 3: ");
		int c = input.nextInt();
		input.close();
		
		int t;
		
		if(a < b && b < c) { // 123 works
		}
		
		if(a < b && b > c) { // 132 works
			t=b;
			b=c;
			c=t;
		}
		 
		if(a > b && c < a) { //   3, 1 2
				t = a;
				a = b;
				b = c;
				c = t;
		}
		
		if(a > b && b < c) { //213 works!!
			t=b;
			b=a;
			a=t;
		}
		
		if(a > b && b < c) { //213 works!!
			t=b;
			b=a;
			a=t;
		}
		
		System.out.println("the numbers in sequential order are " + a + ", " + b + ", " + c);

	}
		
}
	

