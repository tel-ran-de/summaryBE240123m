package summary5.treeSet.comparable;

import java.util.Set;
import java.util.TreeSet;

public class BookTreeSetExample {
    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>();

        Book book1 = new Book(1, "book1");
        Book book2 = new Book(2, "book2");
        Book book3 = new Book(3, "book3");
        Book book4 = new Book(4, "book4");
        Book book5 = new Book(5, "book5");
        Book book6 = new Book(6, "book6");

        books.add(book4);
        books.add(book2);
        books.add(book1);
        books.add(book5);
        books.add(book3);
        books.add(book6);

        System.out.println(books);


    }
}
