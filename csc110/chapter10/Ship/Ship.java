/*Design a Ship class that has the following members:
- A field for the name of the ship (String)
- A field for the year that the ship was built (String)
- A constructor and appropriate accessors and mutators
- A toString method that displays the ship's name and the year it was built.

Design a CruiseShip class that extends the Ship class. The CruiseShip class should have
the following members:
- A field for the maximum number of passengers (Int)
- A constructor and appropriate accessors and mutators
- A toString method that overrides the toString method in the base class. The
CruiseShip class's toString method should display only the ship's name and the
maximum number of passengers.

Design a CargoShip class that extends the Ship class. The CargoShip class should have the
following members:
- A field for the cargo capacity in tonnage (Int)
- A constructor and appropriate accessors and mutators
- A toString method that overrides the toString method in the base class. The
CargoShip class's toString method should display only the ship's name and the ship's cargo capacity.

Demonstrate the classes in a program that has a Ship array. Assign various Ship,
CruiseShip, and CargoShip objects to the array elements. The program should then step
through the array, calling each object's toString method.

 */
public class Ship
{
    //Declares name and year strings
    private String name, year;

    //Constructor that takes name and year as args
    public Ship(String n, String y)
    {
        name = n;
        year = y;
    }
    //Empty Constructor
    public Ship()
    {
        name = "Default";
        year = "Default";
    }

    //Returns name
    public String getName()
    {
        return name;
    }

    //Returns year
    public String getYear()
    {
        return year;
    }

    //Sets name
    public void setName(String n)
    {
        name = n;
    }

    //Sets year
    public void setYear(String y)
    {
        year = y;
    }

    //Overrides toString
    @Override
    public String toString()
    {
        String output = "The ship "+getName()+" was made in "+getYear();
        return output;
    }
}
