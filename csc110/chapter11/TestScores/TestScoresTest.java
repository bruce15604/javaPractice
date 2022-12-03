public class TestScoresTest
{
    public static void main(String[] args)
    {
        double[] scores = {87.5, 98.6, 76.9, 100, 96.3};
        //double[] scores = {87.5, 98.6, 76.9, 101, 96.3};
        //double[] scores = {-87.5, 98.6, 76.9, 100, 96.3};

        //Checks and handles the exception
        try
        {
            TestScores period1 = new TestScores(scores);
            System.out.println("The average score is: "+period1.getAverage());
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Score either negative or greater than 100. ");
            System.out.println(e.getMessage());
        }
    }
}
