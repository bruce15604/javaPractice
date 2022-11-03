import java.util.Scanner;

public class PetTest
{
    public static void main(String[] args)
    {
        //Create new scanner
        Scanner keyboard = new Scanner(System.in);
        //Create new Pet instance
        Pet pet1 = new Pet();
        //Prompts user for name
        System.out.println("Enter the first pet's name: ");
        pet1.setName(keyboard.nextLine());
        //Prompts user for animal type
        System.out.println("Enter what animal the first pet is: ");
        pet1.setAnimal(keyboard.nextLine());
        //Prompts user for pet age
        System.out.println("Enter the age of the first pet: ");
        pet1.setAge(keyboard.nextInt());

        //Outputs pet details to user
        System.out.println("The first pet entered is a(n) "
                            +pet1.getAnimal()+" named "+pet1.getName()+" and they are "
                            +pet1.getAge()+" year(s) old. ");
    }
}
