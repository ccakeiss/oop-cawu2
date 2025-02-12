public class Book {
    public String title;
    public String ISBN;
    public Author author;

    public Book(String title, String ISBN, Author author){
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        System.out.println("HELO");
    }
}
