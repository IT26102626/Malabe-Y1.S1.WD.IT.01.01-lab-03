import java.util.Scanner;
public class IT26102626Lab3Q1B{
	public static void main(String[]args){
		
		//Declaring the variables
		double unitPrice,noOfKilos,discount,totAmount;

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
		
		//Calculating the total amount required to pay without discount
		totAmount = unitPrice*noOfKilos;
		
		//Calculating the 10% discount
		discount = totAmount*0.1;
		
		//Calculating the total amount with disocunt
		totAmount = totAmount - discount;
		
		//Displaying the total amount required to pay
		System.out.println();
		System.out.println("The total amount with 10% discount is: " + totAmount);
		
	}
}