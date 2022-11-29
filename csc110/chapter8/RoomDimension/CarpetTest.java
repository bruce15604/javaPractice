import java.util.Scanner;

public class CarpetTest
{
    public static void main(String[] args)
    {
        //Creates Scanner, RoomDimension, and RoomCarpet objects and declares cost variable
        double cost;
        Scanner keyboard = new Scanner(System.in);
        RoomDimension room1 = new RoomDimension();
        RoomCarpet carpet1 = new RoomCarpet();

        //Prompts the user for the room dimensions
        System.out.println("Enter the dimensions of your room. ");
        System.out.println("Width: ");
        room1.setWidth(keyboard.nextDouble());
        System.out.println("Length: ");
        room1.setLength(keyboard.nextDouble());
        //Sets the RoomDimension room1 to the carpet1 size field
        carpet1.setSize(room1);

        //Prompts user for the cost of the carpet
        System.out.println("Enter the cost of the carpet you plan to purchase. ");
        System.out.print("Carpet Cost: \n$");
        cost = keyboard.nextDouble();
        //Sets the user's inputted cost as the carpet1 size field
        carpet1.setCarpetCost(cost);

        //Outputs carpet1's toString, which is the room dimensions and the total cost of the carpet
        System.out.println(carpet1);
    }
}
