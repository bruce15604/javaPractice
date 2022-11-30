import java.util.Scanner;

public class RetailItemTest
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        RetailItem jacket = new RetailItem("Jacket", 12, 59.95);
        RetailItem jeans = new RetailItem("Jacket", 12, 59.95);
        RetailItem item3 = new RetailItem();

        System.out.println("Change the description for object jeans: ");
        jeans.setDescription(keyboard.nextLine());
        System.out.println("Change the units on hand for object jeans: ");
        jeans.setUnitsOnHand(keyboard.nextInt());
        System.out.println("Change the price for object jeans: ");
        jeans.setPrice(keyboard.nextDouble());

        keyboard.nextLine();
        System.out.println("Set the description for object item3: ");
        item3.setDescription(keyboard.nextLine());
        System.out.println("Set the units on hand for object item3: ");
        item3.setUnitsOnHand(keyboard.nextInt());
        System.out.println("Set the price for object item3: ");
        item3.setPrice(keyboard.nextDouble());

        System.out.println("       Description    Units on Hand    Price ");
        System.out.println("Item #1 "+jacket.getDescription()+"        "+jacket.getUnitsOnHand()+"        "+jacket.getPrice());
        System.out.println("Item #2 "+jeans.getDescription()+"    "+jeans.getUnitsOnHand()+"        "+jeans.getPrice());
        System.out.println("Item #3 "+item3.getDescription()+"        "+item3.getUnitsOnHand()+"        "+item3.getPrice());
    }
}
