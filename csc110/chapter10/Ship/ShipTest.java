/*
Demonstrate the classes in a program that has a Ship array. Assign various Ship,
CruiseShip, and CargoShip objects to the array elements. The program should then step
through the array, calling each object's toString method.
 */
public class ShipTest
{
    public static void main(String[] args)
    {
        //Creates new ship classes, including cruise ships and cargo ships
        Ship ship1 = new Ship("USS Long Island", "1939");
        Ship ship2 = new CruiseShip("RMS Titanic", "1909", 2435);
        Ship ship3 = new Ship("USS Laffey", "1943");
        Ship ship4 = new CargoShip("Ever Ace", "2021", 235579);
        Ship ship5 = new Ship("USS Enterprise", "1958");

        //Creates a ship array and assigns the ships to it
        Ship[] array = new Ship[5];
        array[0] = ship1;
        array[1] = ship2;
        array[2] = ship3;
        array[3] = ship4;
        array[4] = ship5;

        //Steps through the array and calls their toString() method
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}
