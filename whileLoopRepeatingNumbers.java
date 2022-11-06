import java.util.Scanner;
public class whileLoopRepeatingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		byte n = input.nextByte();
		byte j = 1;
		if(n < 10) {
		//count to 10 
//			for(byte i = 1; i <= n ;i++) {
//				for( j = 1; j <= n; j++) {
//					System.out.print( "[ j: " + j + " " + "i: " +i + " ]");
			byte nmb = 0;
			Scanner nm = new Scanner(System.in);
			while(nmb == 0) {
				System.out.println("Enter a number: ");
				 nmb = nm.nextByte();
				
				
			}
				}
//				System.out.println();
//
//				j = 0;
//			}
			
//		}
		else {
			System.out.println("poop");
		}
		System.out.println();
	}

}
