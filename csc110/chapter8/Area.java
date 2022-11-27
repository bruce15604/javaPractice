/*Write a class that has three overloaded static methods for calculating the areas of the
following geometric shapes:
-circles
-rectangles
-cylinders
Here are the formulas for calculating the area of the shapes:
Circle: Area = (pi)r^2
Rectangle: Area = w*l
Cylinder: Area = (pi)(r^2)(h)

Because the three methods are to be overloaded, they should each have the same name, but
different parameter lists. Demonstrate the class in a complete program.
 */
public class Area
{
    //Circle
    public static double calculate(double r)
    {
        //Declares pi and area variables
        double pi = Math.PI;
        double area = 0; //Stores calculated area

        area = pi * (r*r);
        return area;
    }

    //Rectangle
    public static double calculate(double w, double l)
    {
        double area = 0;
        area = w*l;
        return area;
    }

    //Cylinder
    public static double calculate(double r, double h, double pi)
    {
        pi = Math.PI;
        double area = 0;
        area = pi * (r*r) * h;
        return area;
    }
}
