/* Write a program that asks the user to enter five test scores. The program should display a
letter grade for each score and the average test score. Write the following methods in the
program:
calcAverage--This method should accept five test scores as arguments and return the
average of the scores.
determineGrade--This method should accept a test score as an argument and return
the letter grade for the score, based on the following grading scale:
90-100 A
80-89 B
70-79 C
60-69 D
Below 60 F */
import java.util.Scanner;
public class TestAverageAndGrade
{
        public static void main(String[] args) {
            // Declare variables and scanner
            double average, test1, test2, test3, test4, test5;
            char averageLetter = 'F'; //Default F
            Scanner keyboard = new Scanner(System.in);
            // Prompt user for 5 test scores
            System.out.println("Enter first test score: ");
            test1 = keyboard.nextDouble();
            System.out.println("Enter second test score: ");
            test2 = keyboard.nextDouble();
            System.out.println("Enter third test score: ");
            test3 = keyboard.nextDouble();
            System.out.println("Enter fourth test score: ");
            test4 = keyboard.nextDouble();
            System.out.println("Enter fifth test score: ");
            test5 = keyboard.nextDouble();

            //Show letter grades for the tests
            System.out.println("Your test letter grades are: ");
            System.out.println("Test 1: " + determineGrade(test1));
            System.out.println("Test 2: " + determineGrade(test2));
            System.out.println("Test 3: " + determineGrade(test3));
            System.out.println("Test 4: " + determineGrade(test4));
            System.out.println("Test 5: " + determineGrade(test5));

            //Send tests scores as args, determines letter grade and displays average and letter grade to user
            average = calcAverage(test1, test2, test3, test4, test5);
            if (average <= 100)
            {
                if(average >= 90)
                {
                    averageLetter = 'A';
                }
                else if(average >= 80)
                {
                    averageLetter = 'B';
                }
                else if(average >= 70)
                {
                    averageLetter = 'C';
                }
                else if(average >= 60)
                {
                    averageLetter = 'D';
                }
                else if(average < 60)
                {
                    averageLetter = 'F';
                }
            }
            System.out.printf("Your average grade is: %.2f, which is a(n) %c", average, averageLetter);
        }

        public static double calcAverage(double test1, double test2, double test3, double test4, double test5)
        {
            // Declare variable
            double average;

            // Calculate test score average
            average = (test1 + test2 + test3 + test4 + test5) / 5;

            return average; //Returns Average score as a double
        }

        /* determineGrade() method returns a letter grade
        * from a user inputted test score */
        public static char determineGrade(double score)
        {
            char grade = 'F'; //Default F
            if (score <= 100) //Determines proper letter grade for test scores
            {
                if(score >= 90)
                {
                    grade = 'A';
                }
                else if(score >= 80)
                {
                    grade = 'B';
                }
                else if(score >= 70)
                {
                    grade = 'C';
                }
                else if(score >= 60)
                {
                    grade = 'D';
                }
                else
                {
                    grade = 'F';
                }
            }
            return grade; //Returns letter grade
        }
    }
