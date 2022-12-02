/*
Design a CruiseShip class that extends the Ship class. The CruiseShip class should have
the following members:
- A field for the maximum number of passengers (Int)
- A constructor and appropriate accessors and mutators
- A toString method that overrides the toString method in the base class. The
CruiseShip class's toString method should display only the ship's name and the
maximum number of passengers.
 */
public class CruiseShip extends Ship
{
    private int maxPassengers;

    //Constructor that receives an arg for passengers
    public CruiseShip(String n, String y, int pass)
    {
        setName(n);
        setYear(y);
        maxPassengers = pass;
    }
    //Empty constructor
    public CruiseShip()
    {
        maxPassengers = 0;
    }

    //Returns max passengers
    public int getMaxPassengers()
    {
        return maxPassengers;
    }

    //Sets max passengers
    public void setMaxPassengers(int pass)
    {
        maxPassengers = pass;
    }

    //Overrides parent toString()
    @Override
    public String toString()
    {
        String output = "The ship "+getName()+" has a maximum of "+getMaxPassengers()+" passengers ";
        return output;
    }
}
