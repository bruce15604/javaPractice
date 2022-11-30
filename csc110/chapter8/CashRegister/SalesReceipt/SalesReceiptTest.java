import java.io.IOException;
import java.util.Scanner;

public class SalesReceiptTest
{
    public static void main(String[] args)throws IOException
    {
        //Creates Scanner, RetailItem, and CashRegister objects, and declares variables
        Scanner keyboard = new Scanner(System.in);
        RetailItem item = new RetailItem("Jeans", 20, 0);
        SalesReceipt purchase1 = new SalesReceipt();
        int quantity;

        //Prompts user for price of the item they're purchasing
        System.out.println("Item price: ");
        item.setPrice(keyboard.nextDouble());
        //Prompts user for the quantity of items they're buying
        System.out.println("Item Quantity: ");
        quantity = keyboard.nextInt();
        //Sets the item with the current price and quantity to purchase1
        purchase1.setQuantity(quantity);
        purchase1.setItem(item);

        //Outputs purchase information
        purchase1.printReceipt();
    }
}
