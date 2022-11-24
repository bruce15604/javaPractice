/*The local Driver's License Office has asked you to write a program that grades the written
portion of the driver's license exam. The exam has 20 multiple choice questions. Here are
the correct answers:

1.B 6.A 11.B 16.C
2.D 7.B 12.C 17.C
3.A 8.A 13.D 18.B
4.A 9.C 14.A 19.D
5.C 10.D 15.D 20.A

A student must correctly answer 15 of the 20 questions to pass the exam.
Write a class named DriverExam that holds the correct answers to the exam in an array field.
The class should also have an array field that holds the student's answers. The class should
have the following methods:
-passed: Returns true if the student passed the exam, or false if the student failed.
-totalCorrect: Returns the total number of correctly answered questions.
-totalIncorrect: Returns the total number of incorrectly answered questions.
-questionsMissed: An int array containing the question numbers of the questions
that the student missed.

Demonstrate the class in a complete program that asks the user to enter a student's answers,
and then displays the results returned from the DriverExam class's methods.

Input Validation: Only accepts the letters A, B, C, or D as answers.
 */
public class DriverExam
{
    //Creates an array with correct answers
    final private char[] answers = {'B','D','A','A','C',
                                    'A','B','A','C','D',
                                    'B','C','D','A','D',
                                    'C','C','B','D','A'};
    //Sets the number of questions in the test to 20
    final private static int NUM_QUESTIONS = 20;
    //Makes sure the student cannot make more than 5 mistakes to pass the exam (15 to pass)
    final private static int NUM_MISTAKES_ALLOWED = 5;
    //Creates an array for student-inputted responses to the questions
    private char[] studentAnswers = new char[NUM_QUESTIONS];

    //Constructor, takes the studentAns array and assigns every element of it to the studentAnswers array
    public DriverExam(char[] studentAns)
    {
        //Assigns values of passed array to studentAnswers array
        for(int i = 0; i < studentAns.length; i++)
        {
            studentAnswers[i] = studentAns[i];
        }
    }

    //passed class returns if the student achieved 15 or more answers correct
    public boolean passed()
    {
        return totalIncorrect() <= NUM_MISTAKES_ALLOWED;
    }

    //Returns an array of the question numbers to the questions that were answered incorrectly
    public int[] questionsMissed()
    {
        int i = 0; //Denotes which element is currently being checked
        int wrongAnswer = 0; //Keeps track of where the wrong answer is being added in the array
        int[] wrongAnswers = new int[totalIncorrect()]; //Creates wrongAnswers array which will hold the question numbers

        //Determine which questions are incorrect and stores them in the wrongAnswers array
        do{
            if(studentAnswers[i] == answers[i])
            {
                i ++;
            }
            else
            {
                wrongAnswers[wrongAnswer] = (i + 1);
                i++;
                wrongAnswer++;
            }
        }while(i < NUM_QUESTIONS);

        //Returns wrongAnswers array
        return wrongAnswers;
    }

    //Returns how many questions were answered correctly
    public int totalCorrect()
    {
        int i = 0; //Denotes which element is being checked
        int amountCorrect = 0; //Holds the number of answers gotten right

        //Checks questions and determines if they're correct and increases amountCorrect
        do{
            if(studentAnswers[i] == answers[i])
            {
                amountCorrect++;
                i ++;
            }
            else
            {
                i++;
            }
        }while(i < NUM_QUESTIONS);

        //Returns amountCorrect
        return amountCorrect;
    }

    //Returns how many questions were answered incorrectly
    public int totalIncorrect() {
        return NUM_QUESTIONS - totalCorrect();
    }

    //Displays all the results to the user
    public void displayResults()
    {
        //Output the amount of correct and incorrect answers
        System.out.println("Number Correct: "+totalCorrect());
        System.out.println("Number Incorrect: "+totalIncorrect());

        //Inform user on if they passed or not
        if(passed())
        {
            System.out.println("You passed the test");
        }
        else
        {
            System.out.println("You failed the test");
        }

        //Shows user which questions they got wrong
        System.out.print("You got the following questions wrong: ");
        for(int i = 0; i < totalIncorrect(); i++)
        {
            System.out.print(questionsMissed()[i]+"  ");
        }
    }
}
