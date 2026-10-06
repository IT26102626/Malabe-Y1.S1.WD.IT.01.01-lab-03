import java.util.Scanner;
public class IT26102626Lab3Q1A{
	public static void main(String[]args){
		
		//Declaring the variables
		double unitPrice,noOfKilos,totAmount;

		//Creating a Scanner object called input 
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter the unit price of rice
		System.out.print("Enter the price of 1kg of rice: ");
		//Storing the recieved input from the user in a variable
		unitPrice = input.nextDouble();
		
		//Prompt the user to enter the number of kilograms they want to buy
		System.out.print("Enter the number of kilograms you want to buy: ");
		//Storing the recieved input from the user in a variable
		noOfKilos = input.nextDouble();
		
		//Calculating the total amount required to pay
		totAmount = unitPrice*noOfKilos;
		
		//Displaying the total amount required to pay
		System.out.println();
		System.out.println("The total amount is " + totAmount);
		
	}
}