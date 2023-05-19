package summary5.mapCollections;

import java.util.HashMap;
import java.util.Map;

public class MapDogDemo {
    public static void main(String[] args) {
        Map<String, Dog> kennelClub = new HashMap<>();

        Dog dog1 = new Dog("kolly", 2);
        Dog dog2 = new Dog("mastif", 3);
        Dog dog3 = new Dog("basset", 4);

        kennelClub.put("Reks", dog2);
        kennelClub.put("Lessy", dog1);
        kennelClub.put("Tolstjak", dog3);
        kennelClub.put("Choo", dog2);

        System.out.println(kennelClub);

        Dog tempDog = kennelClub.get("Lessy");

        System.out.println(tempDog);


        dog2.age = 5;

        System.out.println(kennelClub);

    }
}
