package Online_Library;

public class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++; // after we add a book in space for eg 0th space we will increase no_of_books by ++
        System.out.println( "\"" + book + "\"" + " has been Added!");
    }

    void showAvailableBooks() {
        System.out.println("Available books are: ");
        for (String book : this.books) {
            if(book == null) {
                continue;
            }
            System.out.println("*" + book);
        }
    }
    void issueBook(String book) {
        for(int i = 0;i<this.books.length;i++) {
            if(this.books[i].equals(book)) {
                System.out.println("The book has been issued! ");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }
    void returnBook(String book) {
        addBook(book);
    }

}
class Lib {

    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books

        Library centralLibrary = new Library();

        centralLibrary.addBook("Think and Grow Rich");
        centralLibrary.addBook("Java");
        centralLibrary.addBook("Mathematics");
        centralLibrary.addBook("Spider-Man");
        centralLibrary.addBook("Harry Potter");
        centralLibrary.addBook("Who Moved My Cheese");
        centralLibrary.addBook("Statistics");
        centralLibrary.addBook("Zero to One");
        centralLibrary.addBook("Attitude is Everything");

        System.out.println("\n");

        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("Java");
        System.out.println();

        centralLibrary.showAvailableBooks();
        System.out.println();
        centralLibrary.returnBook("Java4");
        System.out.println();
        centralLibrary.showAvailableBooks();
    }
}