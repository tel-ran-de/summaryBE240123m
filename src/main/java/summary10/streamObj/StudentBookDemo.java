package summary10.streamObj;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentBookDemo {
    public static void main(String[] args) {
        /*
        Студент имеет записи о прочитанных книгах
        Вывести данные о книгах, которые прочитали все студенты
         */

        Student student1 = new Student();
        student1.setName("Alex");
        student1.addBook("Java 8");
        student1.addBook("Java Spring Boot");
        student1.addBook("Effective Java");

        Student student2 = new Student();
        student2.setName("Thomas");
        student2.addBook("Html introducing");
        student2.addBook("Effective Java");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        Set<String> bookSet = new HashSet<>();

        for (int i = 0; i < students.size(); i++) {
            Set<String> booksOfStudent = students.get(i).getBooks();
           for (String book : booksOfStudent) {
               if (!book.contains("HTML")) {bookSet.add(book);}
           }
        }

        System.out.println(bookSet);

        Set<String> setOfBooks = students.stream()
                .map(x -> x.getBooks())
                .flatMap(x -> x.stream())
                .filter(x -> !x.contains("HTML"))
                .collect(Collectors.toSet());

        System.out.println(setOfBooks);

    }
}
