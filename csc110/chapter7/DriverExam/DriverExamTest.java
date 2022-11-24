import java.util.Scanner;

public class DriverExamTest
{
    //Creates DriverExam object and sets the amount of test questions to 20
    private static DriverExam exam;
    final private static int NUM_QUESTIONS = 20;

    public static void main(String[] args)
    {
        //Creates scanner object
        Scanner keyboard = new Scanner(System.in);
        //Creates arrays for student-inputted answers and the acceptable characters for answers
        char[] studentAnswers = new char[NUM_QUESTIONS];
        char allowedAnswers[] = {'A', 'B', 'C', 'D'};

        //For the entire test, present the questions in order and receive answers for them
        for(int i = 0; i < NUM_QUESTIONS; i++)
        {
            System.out.print("Question "+(i+1)+": ");

            //Gets user input
            String userInput = keyboard.nextLine();
            studentAnswers[i] = userInput.charAt(0);

            //Makes sure user input is acceptable
            if(!validateAnswer(studentAnswers[i], allowedAnswers))
            {
                System.out.println("Please answer with A, B, C, or D");
                i--;
            }
        }

        //Initializes DriverExam object
        exam = new DriverExam(studentAnswers);

        //Display results
        System.out.print("\n");
        exam.displayResults();
    }

    //validateAnswer makes sure the user inputted an allowed character
    public static boolean validateAnswer(char studentAnswer, char[] allowedAnswers)
    {
        //Compares inputted answers to allowedAnswers array
        for(int i = 0; i < allowedAnswers.length; i++)
        {
            if(studentAnswer == allowedAnswers[i])
            {
                return true; //Returns true if answer is valid
            }
        }
        return false; //Returns false if answers are not valid
    }
}

