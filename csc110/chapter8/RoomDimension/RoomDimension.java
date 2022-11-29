/*The Westfield Carpet Company has asked you to write an application that calculates the
price of carpeting for rectangular rooms. To calculate the price, you multiply the area of the floor
by the price per square foot of carpet. For example, the area of floor that is 12 ft long and 10 ft wide
is 120 square ft. To cover that floor with carpet that costs $8 per square foot would cost $960 (12*10*8)

First, you should create a class named RoomDimension that has two fields: one for the length
of the room and one for the width. The RoomDimension class should have a method that
returns the area of the room.

Next you should create a RoomCarpet class that has a RoomDimension object as a field. It
should also have a field for the cost of the carpet per square foot. The RoomCarpet class
should have a method that returns the total cost of the carpet.

Possible Design:
RoomCarpet
----------
-size : RoomDimension
-carpetCost : double
----------
+RoomCarpet(dim : RoomDimension, cost : double) :
+getTotalCost() : double
+toString() : String
/\
\/
||
RoomDimension
----------
-length : double
-width : double
----------
+RoomDimension(len : double, w : double) :
+getArea() : double
+toString(): String
-----------

Once you have written these classes, use them in an application that asks the user
to enter the dimensions of a room and the price per square foot of the desired carpeting. The
application should display the total cost of the carpet.
 */
public class RoomDimension
{
    private double width;
    private double length;

    //Constructor that sets args to the length and width of the instance
    public RoomDimension(double w, double len)
    {
        width = w;
        length = len;
    }
    //Empty arg constructor
    public RoomDimension()
    {
        width = 0;
        length = 0;
    }

    //Returns area of the room
    public double getArea()
    {
        double area = 0;
        area = width * length;
        return area;
    }

    //Returns width
    public double getWidth()
    {
        return width;
    }

    //Returns length
    public double getLength()
    {
        return length;
    }

    //Sets width of the room
    public void setWidth(double w)
    {
        width = w;
    }

    //Sets length of the room
    public void setLength(double l)
    {
        length = l;
    }

    //Overloaded toString that shows the dimensions of the room, common practice for floor dimensions is width first
    public String toString()
    {
        return width+" x "+length;
    }
}
