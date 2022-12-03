/*
Write an exception class named InvalidTestScore. Modify the TestScores class you
wrote in Programming Challenge 1 so that it throws an InvalidTestScore exception if any
of the test scores in the array are invalid.
 */
public class InvalidTestScore extends Exception
{
    //Sends error message when thrown
    public InvalidTestScore()
    {
        super("Error: Test scores out of bounds ");
    }
}
