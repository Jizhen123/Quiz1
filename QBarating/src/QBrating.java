import java.util.Scanner;

public class QBrating {
	
	private static double ATT;
	private static double COMP;
	private static double YDS;
	private static double TD;
	private static double INT;
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		System.out.println("Enter the ATT number: ");
		ATT = input.nextDouble();
		
		System.out.println("Enter the COMP number: ");
		COMP = input.nextDouble();
		
		System.out.println("Enter the YDS number: ");
		YDS = input.nextDouble();
		
		System.out.println("Enter the TD number: ");
		TD = input.nextDouble();
		
		System.out.println("Enter the INT number: ");
		INT = input.nextDouble();
		
			double a = ((COMP / ATT) - 0.3) * 5;
			double b = ((YDS/ATT) - 3) * 0.25;
			double c = (TD / ATT) * 20;
			double d = 2.375 - ((INT / ATT) * 25);
			double QBrating  = ((a + b + c + d) / 6) * 100;
			System.out.printf("The rating is: " + QBrating);
	}
	
}
