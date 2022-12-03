public class TestScores2
{
    //Declares private array of testScores
    private double[] testScores;

    //Constructor that assigns all the values from the inputted array to the testScores array and tests if valid
    public TestScores2(double[] scores) throws InvalidTestScore {
        testScores = new double[scores.length];

        for(int index = 0; index < scores.length; index++)
        {
            testScores[index] = scores[index];
        }

        for(int i = 0; i < testScores.length; i++)
        {
            if(testScores[i] < 0 || testScores[i] > 100)
            {
                throw new InvalidTestScore();
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
