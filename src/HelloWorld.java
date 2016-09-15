import java.util.Scanner;

public class HelloWorld {
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		int num1 = keyboard.nextInt();
		
		System.out.println("Please enter another number: ");
		int num2 = keyboard.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("Sum: " + sum);
	}
}