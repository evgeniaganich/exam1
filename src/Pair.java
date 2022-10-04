public class Pair {

    private final String author;
    private final String bookTitle;

    public Pair(String author, String bookTitle) {
        this.author = author;
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    @Override
    public String toString() {
        return "\"" + bookTitle + "\"" + " " + author;
    }
}
