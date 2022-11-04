/*Design a TestScores class that has fields to hold three test scores. The class should have a
constructor, accessor and mutator methods for the test score fields, and a method that returns
the average of the test scores. Demonstrate the class by writing a separate program that
creates an instance of the class. The program should display the average of the scores
as reported by the TestScores object.
 */
public class TestScores
{
    //Sets fields
    private double test1, test2, test3;

    //Two constructors, one to create an object without having to enter args
    public TestScores()
    {
        this.test1 = 0;
        this.test2 = 0;
        this.test3 = 0;
    }
    public TestScores(double test1, double test2, double test3)
    {
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }

    //Changes test1 value
    public void setTest1(double test1)
    {
        this.test1 = test1;
    }

    //Changes test2 value
    public void setTest2(double test2)
    {
        this.test2 = test2;
    }

    //Changes test3 value
    public void setTest3(double test3)
    {
        this.test3 = test3;
    }

    //Gets test1 value
    public double getTest1()
    {
        return this.test1;
    }

    //Gets test2 value
    public double getTest2()
    {
        return this.test2;
    }

    //Gets test3 value
    public double getTest3()
    {
        return this.test3;
    }

    public double getAverage()
    {
        double average;
        average = (this.test1 + this.test2 + this.test3)/3;
        return average;
    }
}
