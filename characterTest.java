
public class characterTest {
	
	public static class Clock {
		public static void time() {
			System.out.println("time");
		}
		public static String test() {
			return "test one is working";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clock clockBob = new Clock();
		
		Character bob = 'e';
		String stringBob = "test";	
		
		char charBob = '3';
		
		String open = "";
		
		clockBob.time();
		
		
		System.out.println(open + " <=");
		
		open = clockBob.test();
		System.out.println(open);

		
		

	}

}


  /* bob {
	   isDigit
	   isLetter
	   */
	   
	   
	   
	   
	   
	   
	   
	   
	   
   