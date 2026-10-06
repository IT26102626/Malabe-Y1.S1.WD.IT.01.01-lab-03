import java.util.Scanner;
public class IT26102626Lab3Q2{
	public static void main(String[]args){
		
		//Declare the variables
		double monthlySalary,otHours,otHourlyRate,otRate,totAmount;
		
		//Create a scanner object called input
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter month salary
		System.out.print("Enter the monthly salary : ");
		//Storing the received input from the user in a variable
		monthlySalary = input.nextDouble();
		
		//Prompt the user to the number of OT Hours
		System.out.print("Enter the number of OT hours : ");
		//Storing the received input from the user in a variable
		otHours = input.nextDouble();
		
		//Prompt the user to enter the OT hourly rate
		System.out.print("Enter the OT hourly rate : ");
		//Storing the received input from the user in a variable
		otHourlyRate = input.nextDouble();
		
		//Calculate the OT amount
		otRate = otHours*otHourlyRate;
		
		//Calculate the Total Salary 
		totAmount = monthlySalary + otRate;
		
		//Displaying the total salary
		System.out.println();
		System.out.println("The total Salary including OT is: " + totAmount);
	}
}