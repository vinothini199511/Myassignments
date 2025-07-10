package week1.day2;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		// TO check the number is positive
		int version=10;
		
		if (version>=0) {
			
			System.out.println("The given number "  + version +" is Positive");
			
		}
		
		else {
			System.out.println("The given number "  + version +" is Negative");
		}
//I have just tried the below code to check and print from -5 to 10 positive or negative and display
		for (int i = -5; i<=10; i++)
		{
			if (i>=0) {
				System.out.println("The  number "  + i +" is Positive");
				
			}
			else  {
				System.out.println("The  number "  + i +" is Negative");
				
			}
		}
	}

}
