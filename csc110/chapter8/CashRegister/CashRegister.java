/*Write a CashRegister class that can be used with the RetailItem class that you wrote in
Chapter 6's Programming Challenge 4. The CashRegister class should simulate the sale of
a retail item. It should have a constructor that accepts a RetailItem object as an argument.
The constructor should also accept an integer that represents the quantity of items being
purchased. In addition, the class should have the following methods:

-getSubtotal: should return the subtotal of the sale, which is the quantity multiplied by the price.
This method must get the price from the RetailItem object that was passed as an argument to the constructor.

-getTax: should return the amount of sales tax on the purchase. The sales tax rate is 6% of a retail sale.

-getTotal: should return the total of the sale, which is the subtotal plus the sales tax.

Demonstrate the class in a program that asks the user for the quantity of items being purchased
and then displays the sale's subtotal, amount of sales tax, and total.
 */
public class CashRegister
{
    private RetailItem item = new RetailItem();
    private int quantity;
    private double subtotal, tax, total;

    //Constructor that accepts the item and the quantity purchased
    public CashRegister(RetailItem i, int q)
    {
        item.setDescription(i.getDescription());
        item.setUnitsOnHand(i.getUnitsOnHand());
        item.setPrice(i.getPrice());
        quantity = q;
    }

    public CashRegister()
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

    public void setItem(RetailItem i)
    {
        item.setDescription(i.getDescription());
        item.setUnitsOnHand(i.getUnitsOnHand());
        item.setPrice(i.getPrice());
    }

    public void setQuantity(int q)
    {
        quantity = q;
    }
}
