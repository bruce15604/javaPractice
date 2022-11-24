import java.util.Scanner;

public class PayrollTest
{
    public static void main(String[] args)
    {
        //Creates payroll object and scanner object
        Payroll payroll = new Payroll();
        Scanner keyboard = new Scanner(System.in);

        //Starts the main menu
        menu(keyboard, payroll);
    }

    public static void menu(Scanner keyboard, Payroll payroll)
    {
        //Declares initial variables
        boolean repeat = false;
        int input;

        do
        {
            System.out.println("1 --- Input employee information"); //Shows user options
            System.out.println("2 --- View employee information");
            System.out.println("3 --- Exit\n");

            input = keyboard.nextInt(); //Accepts user input

            switch(input)
            {
                case 1:
                {
                    inputInformation(keyboard, payroll); //Starts the data input option
                    break;
                }
                case 2:
                {
                    viewInformation(payroll); //Starts the data view option
                    break;
                }
                case 3:
                {
                    repeat = true; //Signifies user wants to exit program
                    break;
                }
                default:
                {
                    System.out.println("Invalid input");
                    break;
                }
            }
        }while(!repeat);
    }

    public static void inputInformation(Scanner keyboard, Payroll payroll)
    {
        for(int i = 0; i < 7; i++) //For all employees, input relevant information
        {
            System.out.println("Employee " + payroll.getEmployeeId(i)); //Shows user an employee ID

            do
            {
                System.out.println("Enter hours worked: "); //Asks user for employee's hours and receives input
                payroll.setHours(i, keyboard.nextInt());

                if(!validHours(payroll.getHours(i))) //Verifies that hours is a positive number
                {
                    System.out.println("Enter positive numbers for hours");
                }
            }while(!validHours(payroll.getHours(i)));

            do
            {
              System.out.println("Enter pay rate: "); //Asks user for employee's pay rate and receives input
              payroll.setPayRate(i, keyboard.nextDouble());

              if(!validPayRate(payroll.getPayRate(i))) //Verifies that pay rate is above 6.0
              {
                  System.out.println("Enter a rate greater than 6.0: ");
              }
            }while(!validPayRate(payroll.getPayRate(i)));

            payroll.calculateWages(); //Calculates what each employee's wage would be
        }

        System.out.println();
    }

    public static void viewInformation(Payroll payroll)
    {
        for(int i = 0; i < 7; i++) //For each employee, output the relevant information
        {
            System.out.println("Employee " + payroll.getEmployeeId(i));
            System.out.println("Hours worked: " + payroll.getHours(i));
            System.out.format("Pay rate: $%,.2f%n", payroll.getPayRate(i));
            System.out.format("Gross wages: $%,.2f%n%n", payroll.getWages(i));
        }
        System.out.println();
    }
    public static boolean validHours(int input) //Verifies input is positive
    {
        if(input > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean validPayRate(double input) //Verifies input is greater than 6.0
    {
        if(input >= 6.0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
