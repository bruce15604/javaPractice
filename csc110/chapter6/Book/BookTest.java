import java.util.Scanner;

public class BookTest
{
    public static void main(String[] args)
    {
        //Create new scanner
        Scanner keyboard = new Scanner(System.in);
        //Create new Book instance
        Book book1 = new Book("The Masque of the Red Death",
                        "Edgar Allen Poe", "Graham's Magazine", 10);
        System.out.println("Book 1 is currently "+book1.getTitle()+" by "
                            +book1.getAuthor()+" published by "
                            +book1.getPublisher()+" and it sold "+book1.getCopiesSold()+" copies. ");
        //Revises book1 title
        System.out.println("Revise title: ");
        book1.setTitle(keyboard.nextLine());
        //Revises book1 author
        System.out.println("Revise author: ");
        book1.setAuthor(keyboard.nextLine());
        //Revises book1 publisher
        System.out.println("Revise publisher: ");
        book1.setPublisher(keyboard.nextLine());
        //Revises book1 copies sold
        System.out.println("Revise copies sold: ");
        book1.setCopiesSold(keyboard.nextInt());

        //Outputs revised book details to user
        System.out.println("Book 1 is now "+book1.getTitle()+" by "
                +book1.getAuthor()+" published by "
                +book1.getPublisher()+" and it sold "+book1.getCopiesSold()+" copies. ");
    }
}
