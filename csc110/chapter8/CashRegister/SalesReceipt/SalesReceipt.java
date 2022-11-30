import java.io.*;
/*Modify the program you wrote in Programming Challenge 6 to create a file containing a
sales receipt. The program should ask the user for the quantity of items being purchased,
and then generate a file with contents similar to the following:

SALES RECEIPT
Unit Price: $10.00
Quantity: 5
Subtotal: $50.00
Sales Tax: $3.00
Total: $53.00
 */
public class SalesReceipt
{
    private RetailItem item = new RetailItem();
    private int quantity;
    private double subtotal, tax, total;

    //Constructor that accepts the item and the quantity purchased
    public SalesReceipt(RetailItem i, int q)
    {
        item.setDescription(i.getDescription());
        item.setUnitsOnHand(i.getUnitsOnHand());
        item.setPrice(i.getPrice());
        quantity = q;
    }

    //Empty Constructor
    public SalesReceipt()
    {
        quantity = 0;
    }

    //Returns subtotal
    public double getSubtotal()
    {
        subtotal = quantity * item.getPrice();
        return subtotal;
    }

    //Returns tax
    public double getTax()
    {
        double taxRate = 0.06;
        tax = getSubtotal() * 0.06;
        return tax;
    }

    //Returns total
    public double getTotal()
    {
        double total = getSubtotal() + getTax();
        return total;
    }

    //Returns quantity
    public int getQuantity()
    {
        return quantity;
    }

    //Sets the retail item data to the purchase
    public void setItem(RetailItem i)
    {
        item.setDescription(i.getDescription());
        item.setUnitsOnHand(i.getUnitsOnHand());
        item.setPrice(i.getPrice());
    }

    //Sets the quantity being purchased
    public void setQuantity(int q)
    {
        quantity = q;
    }

    //Prints a receipt with relevant information
    public void printReceipt() throws IOException
    {
        File fReceipt = new File("receipt.txt");
        PrintWriter receipt = new PrintWriter("receipt.txt");
        receipt.println("SALES RECEIPT");
        receipt.println("Unit Price: $"+item.getPrice());
        receipt.println("Quantity: "+getQuantity());
        receipt.println("Subtotal: $"+getSubtotal());
        receipt.println("Sales Tax: $"+getTax());
        receipt.println("Total: $"+getTotal());
        receipt.close();
    }
}
