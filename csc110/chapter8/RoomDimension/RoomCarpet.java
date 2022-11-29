public class RoomCarpet
{
    //Creates size field and carpetCost field
    private RoomDimension size = new RoomDimension();
    private double carpetCost;

    //Constructor with args
    public RoomCarpet(RoomDimension dim, double cost)
    {
        size.setWidth(dim.getWidth());
        size.setLength(dim.getLength());
        carpetCost = cost;
    }
    //Arg-less constructor
    public RoomCarpet()
    {
        this.carpetCost = 0;
        size.setWidth(0);
        size.setLength(0);
    }

    //Returns the total cost
    public double getTotalCost()
    {
        double totalCost = size.getArea() * carpetCost;
        return totalCost;
    }

    //Sets the size to the RoomDimension
    public void setSize(RoomDimension dim)
    {
        size.setWidth(dim.getWidth());
        size.setLength(dim.getLength());
    }

    //Sets cost from user input
    public void setCarpetCost(double cost)
    {
        carpetCost = cost;
    }

    //Custom overloaded toString
    public String toString()
    {
        return size.toString() + ": " + "$"+getTotalCost();
    }
}
