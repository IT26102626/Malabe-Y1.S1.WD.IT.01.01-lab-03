import java.util.Scanner;
public class IT26102626Lab3Q4{
	public static void main(String[]args){
	
	//Declare variables
	int number = 0;
	int digit1 = 0;
	int digit2 = 0;
	int digit3 = 0;
	int digit4 = 0;
	int digit5 = 0;
	
	//Create scanner object called input
	Scanner input = new Scanner(System.in);
	
	//Prompt foruser to enter a five digit number
	System.out.print("Enter a five digit number: ");
	//Storing the user's input in a variable
	number = input.nextInt();
	
	//Calculate the first digit
	digit1 = number/10000;
	number = number%10000;
	
	//Calculate the second digit
	digit2 = number/1000;
	number = number%1000;
	
	//Calculate the third digit
	digit3 = number/100;
	number = number%100;
	
	//Calculate the fourth digit
	digit4 = number/10;
	number = number%10;
	
	//Assigning the value for the fifth digit
	digit5 = number;
	
	//Displaying the digits
	System.out.println();
	System.out.print(digit1 + " ");
	System.out.print(digit2 + " ");
	System.out.print(digit3 + " ");
	System.out.print(digit4 + " ");
	System.out.print(digit5);
	}
}
	
	
