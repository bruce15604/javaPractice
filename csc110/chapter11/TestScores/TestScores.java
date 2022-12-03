/*
Write a class named TestScores. The class constructor should accept an array of test scores
as its argument. The class should have a method that returns the average of the test scores.
If any test score in the array is negative or greater than 100, the class should throw an
IllegalArgumentException. Demonstrate the class in a program.
 */
public class TestScores
{
    //Declares private array of testScores
    private double[] testScores;

    //Constructor that assigns all the values from the inputted array to the testScores array and tests if valid
    public TestScores(double[] scores)
    {
        testScores = new double[scores.length];

        for(int index = 0; index < scores.length; index++)
        {
            testScores[index] = scores[index];
        }

        for(int i = 0; i < testScores.length; i++)
        {
            if(testScores[i] < 0 || testScores[i] > 100)
            {
                throw new IllegalArgumentException("Array Element "+i+
                                                   " is out of range with a value of "+testScores[i]);
            }
        }
    }

    //Calculates the average
    public double getAverage()
    {
        double average = 0;

        for(int i = 0; i < testScores.length; i++)
        {
            average += testScores[i];
        }
        average /= testScores.length;;
        return average;
    }
}
