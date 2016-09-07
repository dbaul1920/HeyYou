package HeyYou;

import java.util.Scanner;

public class appDayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String choice;
do{		
		Scanner input = new Scanner(System.in);
		//Greet user
		System.out.println("Welcome to Grand Circus' Room Detail Genirator");
		
		//Enter length		
		double length;
		System.out.print("Enter Length: ");
		length = input.nextDouble();
		
		//Enter width
		int width;
		System.out.print("Enter Width: ");
		width = input.nextInt();
		
		//Display area
		int area = (int) (length * width);
		System.out.println("Area: " + area);
		
		//Display perimeter
		double perimeter = (length + width) * 2;
		System.out.println("Perimeter: "+ perimeter);
		 
		//Prompt user to continue
		System.out.println("Continue? (y/n): ");
		choice = input.nextLine();	
		choice = input.nextLine();
}		
		//If yes repeat previous, if not do say thanks
	
		while (choice.equalsIgnoreCase("y")); {
			}
		 if (choice.equalsIgnoreCase("n")); {
				System.out.println("See you later!");
		}
	}
		}
		