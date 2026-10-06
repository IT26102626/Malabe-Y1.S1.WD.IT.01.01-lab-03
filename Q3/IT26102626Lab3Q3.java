import java.util.Scanner;
public class IT26102626Lab3Q3{
	public static void main(String[]args){
	
	//Declare variables
	int amount = 0;
	int fivethousand = 0;
	int thousand = 0;
	int fivehundred = 0;
	int twohundred = 0;
	int hundred = 0;
	int fifty = 0;
	int twenty = 0;
	int ten = 0;
	int five = 0;
	int two = 0;
	int one = 0;
	
	//Create scanner object called input
	Scanner input = new Scanner(System.in);
	
	//Prompt for user to enter the rupee amount
	System.out.print("Enter the rupee amount: ");
	//Storing the user's input in a variable
	amount = input.nextInt();
	
	//Calculate the number of 5000 notes
	fivethousand = amount/5000;
	amount = amount%5000;
	
	//Calculate the number of 1000 notes
	thousand = amount/1000;
	amount = amount%1000;
	
	//Calculate the number of 500 notes
	fivehundred = amount/500;
	amount = amount%500;
	
	//Calculate the number of 200 notes
	twohundred = amount/200;
	amount = amount%200;
	
	//Calculate the number of 100 notes
	hundred = amount/100;
	amount = amount%100;
	
	//Calculate the number of 50 notes
	fifty = amount/50;
	amount = amount%50;
	
	//Calculate the number of 20 notes
	twenty = amount/20;
	amount = amount%20;
	
	//Calculate the number of 10 rupee coins
	ten = amount/10;
	amount = amount%10;
	
	//Calculate the number of 5 rupee coins
	five = amount/5;
	amount = amount%5;
	
	//Calculate the number of 2 rupee coins
	two = amount/2;
	amount = amount%2;
	
	//Calculate the number of 1 rupee coins
	one = amount/1;
	amount = amount%1;
	
	//Display the count of notes and coins
	System.out.println();
	System.out.println("5000 Notes - " + fivethousand);
	System.out.println("1000 Notes - " + thousand);
	System.out.println("500 Notes - " + fivehundred);
	System.out.println("200 Notes - " + twohundred);
	System.out.println("100 Notes - " + hundred);
	System.out.println("50 Notes - " + fifty);
	System.out.println("20 Notes - " + twenty);
	System.out.println("10 Coins - " + ten);
	System.out.println("05 Coins - " + five);
	System.out.println("02 Coins - " + two);
	System.out.println("01 Coins - " + one);
	}
}