import java.util.Scanner;

public class HelloWorld {
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int choice; 
		int num1;
		int num2;
		
		int answer;
		
		do{
			
			System.out.println("\nPlease enter a number: ");
			num1 = keyboard.nextInt();
			
			System.out.println("Please enter another number: ");
			num2 = keyboard.nextInt();
			
			Calculator calc = new Calculator(num1, num2);
			
			System.out.println("Enter 1 for addition or 2 for subtraction. Enter 0 to exit.");
			choice = keyboard.nextInt();
			
			switch (choice)
			{
			case 1:
				answer = calc.add();
				System.out.println(num1 + " + " + num2 + " = " + answer);
			break;
			case 2:
				answer = calc.subtract();
				System.out.println(num1 + " - " + num2 + " = " + answer);
			break;
			case 0:
				System.exit(0);
			}
			
		}while (choice != 0);
		
		
	}
}