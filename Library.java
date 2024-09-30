import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library(){
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook (Book book){
        books.add(book);
    }

    public void searchByTitle(String title) {
        System.out.println("Searching for books with title containing: " + title);
        for (Book book : books) {
            if (book.getBookTitle().toLowerCase().contains(title.toLowerCase())) {
                book.printBookInfo();
            }
        }
    }

    public void borrowBook(User user, String title) {
        for (Book book : books) {
            if (book.getBookTitle().equalsIgnoreCase(title) && book.getIsAvailable()) {
                book.setIsAvailable(false);
                user.borrowBook(title);
                return;
            }
        }
        System.out.println("Book not available");
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void listAvailableBooks() {
        System.out.println("--- Available Books ---");
        for (Book book : books) {
            if (book.getIsAvailable()) {
                book.printBookInfo();
            }
        }
    }

    public void getBorrowedBooksForAllUsers() {
        System.out.println("--- Borrowing a Book ---");
        for (User user : users) {
            user.printBorrowedBooks();
        }
    }

    public void checkOverdueBooks(){
        System.out.println("--- Overdue ---");
        for (User user : users) {
            user.checkDueDates();
        }
    }
}

