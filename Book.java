public class Book {
    
    private String bookTitle;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book (String bookTitle,String author,String isbn ){

        this.bookTitle = bookTitle;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean available) {
        isAvailable = available;
    }

    public void printBookInfo() {
        System.out.println("Title: " + bookTitle + ", Author: " + author + ", ISBN: " + isbn + ", Available: " + isAvailable);
    }

    
}
