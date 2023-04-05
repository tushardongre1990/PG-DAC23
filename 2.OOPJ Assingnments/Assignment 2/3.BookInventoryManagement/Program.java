import java.net.PortUnreachableException;
import java.util.Scanner;

class Book
{
    private String title;
    private String author;
    private String publisher;
    private String isbn; 
    private int year;
    private double price; 
    private int qty;


    Book()
    {
        this.title = "";
        this.author = "";
        this.publisher = "";
        this.isbn = "";
        this.year = 0;
        this.price = 0;
        this.qty = 0;
    }
   
    // Getter Methods
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
    public String getIsbn()
    {
        return this.isbn;
    }
    public int getYear()
    {
        return this.year;
    }
    public double getPrice()
    {
        return this.price;
    }
    public int getQty()
    {
        return this.qty;
    }

    // Setter Methods

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
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void setQty(int qty)
    {
        this.qty = qty;
    }
    
    // Business Logic methods

    public void increaseQty(int quantity ){
        this.qty = qty + quantity;
    }
    public void decreaseQty(int quantity ){
        this.qty = qty - quantity;
    }
    public double getInventoryValue()
    {
        double totValue = this.price * this.qty;
        return totValue;

    }
}

class BookTest
{
    private static Scanner sc = new Scanner(System.in);
    private Book b1 = new Book();

    public void acceptRecord()
    {
        System.out.println("Enter book title");
        sc.nextLine();
        b1.setTitle( sc.nextLine() );

        System.out.println("Enter book author");
        // sc.nextLine();
        b1.setAuthor( sc.nextLine() );

        System.out.println("Enter book publisher");
        // sc.nextLine();
        b1.setPublisher( sc.nextLine() );

        System.out.println("Enter book isbn");
        // sc.nextLine();
        b1.setIsbn( sc.nextLine() );

        System.out.println("Enter book year");
        // sc.nextLine();
        b1.setYear( sc.nextInt() );

        System.out.println("Enter book price");
        // sc.nextLine();
        b1.setPrice( sc.nextDouble() );

        System.out.println("Enter book quantity");
        sc.nextLine();
        b1.setQty( sc.nextInt() );


    }

    public void printRecord()
    {
        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getPublisher());
        System.out.println(b1.getIsbn());
        System.out.println(b1.getYear());
        System.out.println(b1.getPrice());
        System.out.println(b1.getQty());

        System.out.println(b1.getInventoryValue());

    }

    public void incDecBook()
    {
        b1.decreaseQty(sc.nextInt());
        b1.increaseQty(sc.nextInt());
    }

    public static int menuList( ){
        System.out.println("0.Exit");
        System.out.println("1.Accept Record.");
        System.out.println("2.Print Record");
        System.out.println("4.Increase / Decrease Book Quantity");
        System.out.print("Enter choice  : ");
        return sc.nextInt();
      }

}



public class Program 
{
    public static void main(String[] args) 
    {
        int choice;

        BookTest bt1 = new BookTest();

        while( (choice = BookTest.menuList()) != 0 )
        {
            switch(choice)
            {
                case 1 : bt1.acceptRecord();
                System.out.println("________________________________");
                break;
                case 2 : bt1.printRecord();
                System.out.println("________________________________");
                break;
                case 3 : bt1.incDecBook();
                System.out.println("________________________________");
            }
        }
        
    }
    
}
