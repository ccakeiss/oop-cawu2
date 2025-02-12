import java.util.ArrayList;

public class Library {

    // Borrower borrowerData;
    ArrayList<Book> books;

    public Library(){
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        // count++;
        this.books.add(book);
        status(book);
    }

    public void status(Book book){
        System.out.println("Book added to library: " + book.title);
    }

    public void borrowBook(Borrower borrowerData, Book book){
        System.out.println(borrowerData.name + " borrowed: " + book.title);

        this.books.remove(book);
        borrowerData.getBookData(book);
    }

    public void returnBook(Borrower borrowerData, Book book) {
        System.out.println(borrowerData.name + " returned: " + book.title);

        borrowerData.returnBook(book);
        this.books.add(book);
    }

    public void displayLibraryBooks(){
        System.out.println("Books in Library:");
        for(Book book : this.books){
            System.out.println("Title: " + book.title);
            System.out.println("ISBN: " + book.ISBN);
            System.out.println("Author: " + book.author.name);
            System.out.println("Biography: " + book.author.biography);
            System.out.println("------------------------");
        }
    }
}
