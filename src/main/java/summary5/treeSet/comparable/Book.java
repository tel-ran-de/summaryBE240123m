package summary5.treeSet.comparable;

public class Book implements Comparable<Book>{

    int id;

    String bookName;

    public Book(int id, String bookName) {
        this.id = id;
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book book) {
        return id - book.id;
    }
}
