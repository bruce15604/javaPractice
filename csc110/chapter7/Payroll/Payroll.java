/*Write a Payroll class that uses the following arrays as fields:
-employeeId: An array of seven integers to hold employee identification numbers. The
array should be initialized with the following numbers:
5658845 4520125 785122 8777541 8451277 1302850 7580489
-hours: An array of seven integers to hold the number of hours worked by each employee.
-payRate: An array of seven doubles to hold each employee's hourly pay rate.
-wages: An array of seven doubles to hold each employee's gross wages.

The class should relate the data in each array through the subscripts. For example, the number
in element 0 of the hours array should be the number of hours worked by the employee
whose ID number is stored in element 0 of the payRate array.
In addition to the appropriate accessor and mutator methods, the class should have a method
that accepts an employee's ID number as an argument and returns the gross pay
for that employee.
Demonstrate the class in a complete program that displays each employee number and asks
the user to enter that employee's hours and pay rate. It should then display each employee's
ID number and gross wages.

Input Validation: Do not accept negative values for hours or numbers less than 6.00 for pay rate.
 */
public class Payroll
{
    //Initiates fields
    private int[] employeeId = {5658845, 4520125, 785122, 8777541, 8451277, 1302850, 7580489};
    private int[] hours = new int[7];
    private double[] payRate = new double[7];
    private double[] wages = new double[7];

    //Calculates wages
    public void calculateWages()
    {
        for(int i = 0; i < 7; i++) //For each element, find the wages based on inputted hours and pay rate
        {
            wages[i] = hours[i] * payRate[i];
        }
    }

    //returns specific employee id when called
    public int getEmployeeId(int subscript)
    {
        return employeeId[subscript];
    }
    //returns specific element value of hours
    public int getHours(int subscript)
    {
        return hours[subscript];
    }
    //returns specific element value of pay rate
    public double getPayRate(int subscript)
    {
        return payRate[subscript];
    }
    //returns specific employee's wage
    public double getWages(int subscript)
    {
        return wages[subscript];
    }
    //sets the hours for the specified employee
    public void setHours(int subscript, int hours)
    {
        this.hours[subscript] = hours;
    }
    //sets the pay rate for the specified employee
    public void setPayRate(int subscript, double payRate)
    {
        this.payRate[subscript] = payRate;
    }
}
