package week1.day2;

public class IsPrime {
	//created main method using shortcut main(ctrl+space+enter)
	public static void main(String[] args) {
		//for (int i = 1; i <=50; i++)
		int i=13;
		{
			if (i%2==0||i%3==0||i%5==0) {
				System.out.println("The number is not a prime"+i);
				
			}
			else if (i%1==0) {
				System.out.println("The numer is  prime"+i);
			}
			
		}
		
	}

}
