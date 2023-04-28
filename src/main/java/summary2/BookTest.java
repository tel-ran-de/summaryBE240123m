package summary2;

public class BookTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Book book1 = new Book("Java", new Author("New summary2.Author"));
        //summary2.Book book2 = book1;
        Book book4 = book1.ourCloneMethod();
        System.out.println(book1.getName());
        System.out.println(book1.getAuthor().getName());
        System.out.println(book4.getName());
        System.out.println(book4.getAuthor().getName());

        System.out.println();

        book4.getAuthor().setName("Robert Martin");
        book4.setName("Clean code");

        System.out.println(book1.getName());
        System.out.println(book1.getAuthor().getName());
        System.out.println(book4.getName());
        System.out.println(book4.getAuthor().getName());
    }
}