package construct.ex;

public class Book {
    String title;
    String author;
    int pages;

    Book() {
        this("", "", 0);
    }

    Book(String title, String author) {
        this(title, author, 0);
    }

    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    void displayInfo() {
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("페이지: " + pages);
    }
}
