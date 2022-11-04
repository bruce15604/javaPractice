/*Write a Circle class that has the following fields:
radius - double
PI - final double with value 3.14159
The class should have the following methods:
Constructor - Accepts the radius of the circle as an argument
Constructor - A no-arg constructor that sets the radius to 0.0
setRadius - mutator for radius field
getRadius - accessor for radius field
area - returns area of circle "area = PI * radius * radius"
diameter - returns diameter of circle "diameter = radius * 2"
circumference - returns circumference of circle "circumference = 2 * PI * radius"
 */
public class Circle
{
    //Sets pi and declares radius fields
    private double radius;
    final private double PI = 3.14159;

    //Two constructors, one for radius arg and one without
    public Circle()
    {
        this.radius = 0.0;
    }
    public Circle(double radius)
    {
        this.radius = radius;
    }

    //Sets radius
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    //Returns radius
    public double getRadius()
    {
        return this.radius;
    }

    //Returns area
    public double area()
    {
        double area;
        area = PI * radius * radius;
        return area;
    }

    //Returns diameter
    public double diameter()
    {
        double diameter;
        diameter = radius * 2;
        return diameter;
    }

    //Returns circumference
    public double circumference()
    {
        double circumference;
        circumference = 2 * PI * radius;
        return circumference;
    }

}
