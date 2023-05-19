package summary5.treeSet.comparable;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>();

        stringSet.add("Hello");
        stringSet.add("World");
        stringSet.add("I ");
        stringSet.add("Love");
        stringSet.add("Java");

        System.out.println(stringSet);

        Set<Integer> integerSet = new TreeSet<>();

        integerSet.add(10);
        integerSet.add(100);
        integerSet.add(1);
        integerSet.add(11);
        integerSet.add(1110);
        integerSet.add(5);
        integerSet.add(20);

        System.out.println(integerSet);

        Set<Phones> phones = new TreeSet<>();

        phones.add(new Phones("iPhone 14"));
        phones.add(new Phones("iPhone 12"));
        phones.add(new Phones("iPhone 11"));
        phones.add(new Phones("iPhone 13"));

        System.out.println(phones);


    }
}
