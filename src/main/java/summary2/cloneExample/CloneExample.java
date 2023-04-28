package summary2.cloneExample;

public class CloneExample {
    public static void main(String[] args) {

        String x = "Text1";

        String y = x;

        System.out.println(y);


        Author author = new Author("Fenimor Kuper");

        System.out.println(author);

        Author author2 = author;
        System.out.println(author2);


        author2.setName("Swift");

        System.out.println(author);

//===============================================

        Book book1 = new Book("Gulliver", new Author("Swift"));

        System.out.println(book1);

        Book book2 = book1.ourCloneMethod();

        System.out.println(book2);





    }
}
