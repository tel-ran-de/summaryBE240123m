package summary9.methodRef.methodReference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("John", "Smith"));
        users.add(new User("Bill", "Collins"));
        users.add(new User("Elton", "John"));

        users.sort(Comparator.comparing(User::getSurname));

        users.sort(Comparator.comparing(user -> user.getSurname()));


        users.forEach(System.out::println);
        users.forEach(user -> System.out.println(user));
    }
}
