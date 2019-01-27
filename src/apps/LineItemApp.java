package apps;

import java.text.NumberFormat;
import java.util.Scanner;

public class LineItemApp {
	
	/*The application determines the price of 
	the product based on the product code.*/

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Line Item Calculator");
		System.out.println();
		Scanner sc = new Scanner (System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			//get input from user
			System.out.println("Enter product code: ");
			String productCode = sc.nextLine(); 
			
			System.out.println("Enter quantity:   ");
			int quantity = Integer.parseInt(sc.nextLine());
			
			int price;
			//set product price based on product code double price;
			if (productCode.equalsIgnoreCase("java")) {
				price = (int) 57.50;
			} else if (productCode.equalsIgnoreCase("jsp")) {
				price = (int) 57.50;
			} else if (productCode.equalsIgnoreCase("mysql")) {
				price = (int) 54.50;
			} else {
				price = 0;	
			}
			
			//calculate total
			double total = price * quantity; 
			//format and display output
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			String priceFormatted = currency.format(price);
			String totalFormatted = currency.format(total);
			String message = "\nLine ITEM\n" +
			"Code:            " + productCode + "\n" +
			"Price:           " + priceFormatted + "\n" +
			"Quantity:        " + quantity + "\n" +
			"Total:           " + totalFormatted + "\n";
			System.out.println(message);
			
			// see if the user wants to continue
			System.out.println("Continue? (y/n): ");
			choice = sc.nextLine();
			System.out.println();
		}
		sc.close();
		System.out.println("Bye!");
			
			
		}

	}


