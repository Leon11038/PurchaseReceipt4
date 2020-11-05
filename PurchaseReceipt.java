/*Programmer: Ryan Dubeau
 * Date: 11/4/2020
 * Purpose: Print out a receipt of purchases people made
 */
//Import the scanner and Decimal format
import java.util.Scanner;
import java.text.DecimalFormat;
public class PurchaseReceipt {

	public static void main(String[] args) {

		//Import scanner and Decimal format class
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#,###.##");

		//Ask the user how many items they have
		System.err.print("How many items do you have? ");
		int amountOfItems = input.nextInt();

		if (amountOfItems < 0) {
			System.out.println("Error: Negative number of items");
			System.exit(1);
		}
		//Create arrays with the length being the ammount of items
		String [] item = new String [amountOfItems];
		int [] quantity = new int [amountOfItems];
		double [] unitPrice = new double [amountOfItems];

		//Create a for loop that asks the user to enter their items, prices and the amount
		for (int index = 0; index < amountOfItems; index++) {
			System.err.print("Enter item " + (index + 1) + ": " );
			item[index] = input.next();
			System.err.print("Enter the quantity: ");
			quantity[index] = input.nextInt();
			System.err.print("Enter the unit price: ");
			unitPrice[index] = input.nextDouble();

		}
		//Print the receipt
		System.out.println("----------------------------------------\nRECEIPT");
		System.out.print("---------------------------------------- \n");

		//Print the prices, quantity and names of the purchases
		for (int index = 0; index < item.length; index++) {
			System.out.println(quantity[index] + " x " + item[index] + ": $" + (unitPrice[index] * quantity[index]) );

		}
		//Print subtotal and create a subtotal variable
		System.out.print("---------------------------------------- \nSUBTOTAL: $");
		double subtotal = 0; 

		//Create a loop that changes the value of subtotal
		for(int index = 0; index < amountOfItems ; index++) {
			subtotal += unitPrice[index] * quantity[index];

		}
		//Print the rest of the receipt
		System.out.println(formatter.format( subtotal));
		System.out.println("Tax: $" + formatter.format(subtotal * 0.13));
		System.out.println("---------------------------------------- ");
		System.out.println("TOTAL: $" + formatter.format(subtotal * 1.13));
		System.out.println("---------------------------------------- ");
	}
}


