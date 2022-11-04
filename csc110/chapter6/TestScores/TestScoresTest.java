import java.util.Scanner;

public class TestScoresTest
{
    public static void main(String[] args)
    {
        //Creates scanner and variables
        Scanner keyboard = new Scanner(System.in);
        double average1, average2;

        //Shows that one constructor takes args and the other doesn't
        TestScores testPeriod1 = new TestScores(97.4, 87.9, 96.8);
        TestScores testPeriod2 = new TestScores();

        //Prompts user for first test score
        System.out.println("Enter the first test score: ");
        testPeriod2.setTest1(keyboard.nextDouble());
        //Prompts user for second test score
        System.out.println("Enter the second test score: ");
        testPeriod2.setTest2(keyboard.nextDouble());
        //Prompts user for third test score
        System.out.println("Enter the third test score: ");
        testPeriod2.setTest3(keyboard.nextDouble());

        average1 = testPeriod1.getAverage();
        average2 = testPeriod2.getAverage();

        //Outputs averages
        System.out.printf("During the first test period, you got an average of %,.2f%n", average1);
        System.out.printf("During the second test period, you got an average of %,.2f%n", average2);
    }
}
