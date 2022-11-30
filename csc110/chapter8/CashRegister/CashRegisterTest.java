import java.util.Scanner;

public class CashRegisterTest
{
    public static void main(String[] args)
    {
        //Creates Scanner, RetailItem, and CashRegister objects, and declares variables
        Scanner keyboard = new Scanner(System.in);
        RetailItem item = new RetailItem("Jeans", 20, 0);
        CashRegister purchase1 = new CashRegister();
        double subtotal, tax, total;
        String desc;
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

        //Sets variables to the description, subtotal, tax, and total for neat formatting
        desc = item.getDescription();
        subtotal = purchase1.getSubtotal();
        tax = purchase1.getTax();
        total = purchase1.getTotal();

        //Outputs purchase information
        System.out.printf("Your purchase of %d "+desc+"(s) had a subtotal of $%,.2f, added tax of $%,.2f,"+
                          " and a final total of $%,.2f", quantity, subtotal, tax, total);
    }
}
