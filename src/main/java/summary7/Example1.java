package summary7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Example1 {
    public static void main(String[] args) {
        Map<Person, Dog> myMap = new HashMap<>();

        myMap.put(new Person("Petya", 25), new Dog("Tuzik"));

        Person person = new Person("Vasya", 40);
        System.out.println("Vasya hash = " + person.hashCode());
        myMap.put(person, new Dog("Bobik"));

        System.out.println(myMap);

        person.setAge(41);

        Dog secondDog = myMap.get(person);

        System.out.println("Vasya hash (41) = " + person.hashCode());
        System.out.println(secondDog);
        System.out.println(myMap);

        Person ruslan = new Person("Ruslan", 40);
        System.out.println();

        myMap.put(ruslan,new Dog("Sharik"));

        ruslan.setName("Ruslik");

        Dog thirdDog = myMap.get(ruslan);

        System.out.println(myMap);

        System.out.println(thirdDog);


        ruslan.setName("Ruslan");

        thirdDog = myMap.get(ruslan);

        System.out.println(myMap);

        System.out.println(thirdDog);

        Person vasya2 = new Person("Vasya" ,40);

        System.out.println("New Vasya hash (40) = " + vasya2.hashCode());

        Dog anotherVasyaDog = myMap.get(vasya2);

        System.out.println(anotherVasyaDog);

    }
}
