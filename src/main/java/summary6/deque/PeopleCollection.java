package summary6.deque;

import java.util.Deque;
import java.util.LinkedList;

public class PeopleCollection {
    public static void main(String[] args) {
        Deque<Person> people = new LinkedList<>();

        people.addFirst(new Person("John"));
        people.addLast(new Person("Bill"));
        people.addFirst(new Person("Andrew"));

        System.out.println(people);


    }
}
