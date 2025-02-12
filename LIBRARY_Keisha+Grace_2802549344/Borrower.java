import java.util.ArrayList;

public class Borrower {

    public String name;
    ArrayList<Book> books;

    //constructor method yang pertama kali dipanggil ketika dibuat object
    public Borrower(String name){
        this.name = name;
        books = new ArrayList<Book>();
    }

    public void getBookData(Book book){
        this.books.add(book);
    }

    public void returnBook(Book book){
        this.books.remove(book);
    }

    public void displayBorrowedBooks(){

        System.out.println(name + "'s Borrowed Books:");
        for(Book book : this.books){
            System.out.println("Title: " + book.title);
            System.out.println("ISBN: " + book.ISBN);
            System.out.println("Author: " + book.author.name);
            System.out.println("Biography: " + book.author.biography);
            System.out.println("------------------------");
        }
    }

}
