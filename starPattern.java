import java.util.Scanner; 
public class starPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		input.close();
		
		//if statement to enter loop condition in range of
		if (number >=2 && number <= 15) {
			//where count < 16;
			//Enter loop
			//WHY CAST TO INT? BECAUSE ISSPACE IS AN INT?
			for (int row = 1; row <= number; row++) {			
			   for (int isSpace = (int)(number - row); isSpace > 0; isSpace--){ 
					System.out.print("* ");		
			   }
		    for(int triangle2 = row; triangle2 > 0; triangle2--) {
				   System.out.print(triangle2 + " ");
			   }
		    //start off at 2 not 1 by second statement traingle3 <= row
		    for(int triangle3 = 2; triangle3 <= row; triangle3++) {
		    	System.out.print(triangle3 + " ");
		    }
		System.out.println();
			}
		}
			else {
				System.out.println("");
			}		
		}
	}

		

		/*
		for (int j = 1; j <= i; j++) {
			System.out.print("*  ");
		}
		
		for (int j = 1; j<= i; j++) {
			System.out.print("  *");
		}
		*/

/*middle commented out
 *  *  *  *  * 1  
 *  *  *  * 1  2  
 *  *  * 1  2  3  
 *  * 1  2  3  4  
 * 1  2  3  4  5  
 * 
 */

/*with nothing commented out

 *  *  *  *  * 1  1  
 *  *  *  * 1  2  1  2  
 *  *  * 1  2  3  1  2  3  
 *  * 1  2  3  4  1  2  3  4  
 * 1  2  3  4  5  1  2  3  4  5  
*/

/* with bottom commented out
 *  *  *  *  * 1  
 *  *  *  * 1  2  
 *  *  * 1  2  3  
 *  * 1  2  3  4  
 * 1  2  3  4  5  
 */


/*
//nested loops
//IF USING number 3 < makes 2 stars, <= makes 3 stars
for (int i = 1; i<=n; i++) {

	for (int j = i; j <= n; i++ ) {
	System.out.print("  *  ");	
	}
	for(int j = 1; j < i; j++){
	System.out.print(" fuck");
	}
	for(int j = 1; j <= i; j++){
		System.out.print("fuck ");
	}
System.out.println();
}
*/