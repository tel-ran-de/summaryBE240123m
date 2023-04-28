package summary2.cloneExample;

public class Book {
    private String name;
    private Author author;

    public Book(String name, Author author) {
        this.name = name;
        this.author = author;
    }

    public Book(Book book){
        this.name = book.getName();
        this.author = new Author(book.getAuthor());
    }

    Book(){

    }

    public Book ourCloneMethod(){
        Book book = new Book();

        book.setName(this.name);

        book.setAuthor(new Author(this.author.getName()));

        return book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                '}';
    }
}
