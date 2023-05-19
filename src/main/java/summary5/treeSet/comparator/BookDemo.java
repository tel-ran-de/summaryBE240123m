package summary5.treeSet.comparator;

import java.util.Set;
import java.util.TreeSet;

public class BookDemo {
    public static void main(String[] args) {
        Set<Book> library = new TreeSet<>();

        library.add(new Book(10,"Book2"));
        library.add(new Book(2,"Book2"));
        library.add(new Book(1,"Book4"));
        library.add(new Book(7,"Book3"));
        library.add(new Book(5,"Book7"));
        library.add(new Book(1,"Book10"));
        library.add(new Book(12,"Book12"));
        library.add(new Book(15,"Book15"));

        for (Book myBook : library) {
            System.out.println("id = " + myBook.id + " Book name: " + myBook.bookName);
        }

        System.out.println("===============");

        BookComparator bookComparator = new BookComparator();
        Set<Book> libraryComparator = new TreeSet<>(bookComparator);

        libraryComparator.add(new Book(10,"Book2"));
        libraryComparator.add(new Book(2,"Book2"));
        libraryComparator.add(new Book(1,"Book4"));
        libraryComparator.add(new Book(7,"Book3"));
        libraryComparator.add(new Book(5,"Book7"));
        libraryComparator.add(new Book(1,"Book10"));
        libraryComparator.add(new Book(12,"Book12"));
        libraryComparator.add(new Book(15,"Book15"));

        for (Book myBook : libraryComparator) {
            System.out.println("id = " + myBook.id + " Book name: " + myBook.bookName);
        }



    }
}
