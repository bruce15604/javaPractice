/*
Design a CargoShip class that extends the Ship class. The CargoShip class should have the
following members:
- A field for the cargo capacity in tonnage (Int)
- A constructor and appropriate accessors and mutators
- A toString method that overrides the toString method in the base class. The
CargoShip class's toString method should display only the ship's name and the ship's cargo capacity.
 */
public class CargoShip extends Ship
{
    private int cargoCapacity;

    //Constructor that accepts args for cargo capacity
    public CargoShip(String n, String y, int cargo)
    {
        setName(n);
        setYear(y);
        cargoCapacity = cargo;
    }
    //Empty Constructor
    public CargoShip()
    {
        cargoCapacity = 0;
    }

    //Returns cargo capacity
    public int getCargoCapacity()
    {
        return cargoCapacity;
    }

    //Sets cargo capacity
    public void setCargoCapacity(int cargo)
    {
        cargoCapacity = cargo;
    }

    //Overrides parent toString()
    @Override
    public String toString()
    {
        String output = "The ship "+getName()+" has a maximum of "+getCargoCapacity()+" tons of cargo ";
        return output;
    }
}
