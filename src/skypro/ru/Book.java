package skypro.ru;

public class Book {
    private String bookName;
    private Author author;
    private int yearPublishing;

    public Book(String bookName, Author author, int yearPublishing) {
        this.bookName = bookName;
        this.author = author;
        this.yearPublishing = yearPublishing;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublishing() {
        return this.yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}


