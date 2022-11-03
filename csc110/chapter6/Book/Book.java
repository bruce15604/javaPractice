/* Write a constructor for this class, the constructor should accept an
argument for each of the fields
Write accessor and mutator methods for each field.
Draw a UML diagram for the class, including the methods you have written.
 */
public class Book
{
    private String title;
    private String author;
    private String publisher;
    private int copiesSold;

    public Book(String title, String author, String publisher, int copiesSold)
    {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copiesSold = copiesSold;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public void setCopiesSold(int copiesSold)
    {
        this.copiesSold = copiesSold;
    }

    public String getTitle()
    {
        return this.title;
    }

    public String getAuthor()
    {
        return this.author;
    }

    public String getPublisher()
    {
        return this.publisher;
    }

    public int getCopiesSold()
    {
        return this.copiesSold;
    }
}
