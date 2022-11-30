/*Write a class named RetailItem that holds data about an item in a retail store. The class
should have the following fields:

-description: References a String object that holds a brief description of the item
-unitsOnHand: Int variable that holds the number of units currently held in inventory
-price: Double that holds the retail price

Write a constructor that accepts arguments for each field, appropriate mutator methods that
store values in these fields, and accessor methods that return the values in these fields. Once
you have written the class, write a separate program that creates three RetailItem objects
and stores the following data in them:

         Description    Units on Hand   Price
Item #1: Jacket         12              59.95
Item #2: Designer Jeans 40              34.95
Item #3: Shirt          20              24.95

 */
public class RetailItem
{
    //Create fields
    private String description;
    private int unitsOnHand;
    private double price;

    //Constructor that takes input for the fields and assigns them
    public RetailItem(String desc, int units, double p)
    {
        description = desc;
        unitsOnHand = units;
        price = p;
    }

    //Empty constructor for adding values later
    public RetailItem()
    {
        description = "Default";
        unitsOnHand = 0;
        price = 0;
    }

    //Returns the description
    public String getDescription()
    {
        return description;
    }

    //Returns the amount of units in stock
    public int getUnitsOnHand()
    {
        return unitsOnHand;
    }

    //Returns the price of the item
    public double getPrice()
    {
        return price;
    }

    //Sets or changes the description of an item
    public void setDescription(String desc)
    {
        description = desc;
    }

    //Sets the amount of stock for an item
    public void setUnitsOnHand(int units)
    {
        unitsOnHand = units;
    }

    //Sets the price for an item
    public void setPrice(double p)
    {
        price = p;
    }
}
