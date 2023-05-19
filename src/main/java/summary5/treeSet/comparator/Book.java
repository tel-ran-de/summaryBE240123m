package summary5.treeSet.comparator;

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

        int compareResult = id - book.id;

        if (compareResult == 0) {
            compareResult = bookName.compareTo(book.bookName);
        }
        return compareResult;

    }
}
