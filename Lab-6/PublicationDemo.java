class Book 
{
    private String authorName;

    public Book(String authorName) 
    {
        this.authorName = authorName;
    }

    public String getAuthorName() 
    {
        return authorName;
    }

    public void displayPublication() 
    {

    }
}

class BookPublication extends Book 
{
    private String title;

    public BookPublication(String authorName, String title) 
    {
        super(authorName);
        this.title = title;
    }

    @Override
    public void displayPublication() 
    {
        System.out.println("Book Publication - Author: " + getAuthorName());
        System.out.println("Title: " + title);
    }
}

class PaperPublication extends Book 
{
    private String title;

    public PaperPublication(String authorName, String title) 
    {
        super(authorName);
        this.title = title;
    }

    @Override
    public void displayPublication() 
    {
        System.out.println("Paper Publication - Author: " + getAuthorName());
        System.out.println("Title: " + title);
    }
}

public class PublicationDemo 
{
    public static void main(String[] args) 
    {
        if (args.length < 3) 
        {
            System.out.println("Usage: java PublicationDemo author_name publication_type title");
            System.exit(1);
        }

        String authorName = args[0];
        String publicationType = args[1];
        String title = args[2];

        Book publication;
        if (publicationType.equalsIgnoreCase("book")) 
        {
            publication = new BookPublication(authorName, title);
        } 
        else if (publicationType.equalsIgnoreCase("paper")) 
        {
            publication = new PaperPublication(authorName, title);
        } 
        else 
        {
            System.out.println("Invalid publication type. Please specify 'book' or 'paper'.");
            return;
        }

        publication.displayPublication();
    }
}
