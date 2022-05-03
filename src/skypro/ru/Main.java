package skypro.ru;

public class Main {


    public static void main(String[] args) {
        Author author1 = new Author("Стивен", "Кинг");
        System.out.println("Автор: " + author1.getName() + " " + author1.getLastName());
        Author author2 = new Author("Анджей", "Сапковский");
        System.out.println("Автор: " + author2.getName() + " " + author2.getLastName());
        Book book1 = new Book("Темная башня", author1, 1982);
        Book book2 = new Book("Ведьмак",author2, 1986);
        System.out.println("book1 = " + book1.getBookName() + "; " + book1.getAuthor().getFullName() + "; " + book1.getYearPublishing());
        System.out.println("book2 = " + book2.getBookName() + "; " + book2.getAuthor().getFullName() + "; " + book2.getYearPublishing());
        book1.setYearPublishing(2003);
        System.out.println("book1 = " + book1.getBookName() + "; " + book1.getAuthor().getFullName() + "; " + book1.getYearPublishing());
    }
}
