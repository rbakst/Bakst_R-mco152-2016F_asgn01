import java.util.Scanner;

public class HelloWorld {
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		int num1 = keyboard.nextInt();
		
		System.out.println("Please enter another number: ");
		int num2 = keyboard.nextInt();
		
		Adder addNums = new Adder (num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + addNums.add());
		
		Subtractor subtractNums = new Subtractor(num1, num2);
		System.out.println(num1 + " - " + num2 + " = " + subtractNums.subtract());
		
		
	}
}