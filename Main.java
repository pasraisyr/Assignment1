public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Harry Potter", "J.K.Rowling", "1234"));
        library.addBook(new Book("Lord of the Rings", "J.R.R. Tolkien", "6789"));

        User alice = new User ("Alice",25);
        User bob = new User ("Bob", 30);

        library.addUser(alice);
        library.addUser(bob);

        library.listAvailableBooks();

        library.borrowBook(alice, "Harry Potter");
        library.borrowBook(bob, "Lord of the Rings");

        library.getBorrowedBooksForAllUsers();
        library.checkOverdueBooks();
       
        
    }   
}
