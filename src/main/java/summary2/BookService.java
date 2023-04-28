package summary2;

public class BookService {
    public Book bookDuplicate(Book ourBook){
        Book book = new Book();

        book.setName(ourBook.getName());

        book.setAuthor(ourBook.getAuthor());

        return book;
    }
}
