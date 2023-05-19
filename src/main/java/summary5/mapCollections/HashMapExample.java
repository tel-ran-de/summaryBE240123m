package summary5.mapCollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> mapCollection = new HashMap<>();

        mapCollection.put(1,"Ruslan");
        mapCollection.put(2,"Victor");
        mapCollection.put(3,"Elene");
        mapCollection.put(4,"John");
        mapCollection.put(5,"Ruslan");

        System.out.println(mapCollection);

        String str = mapCollection.get(3);

        System.out.println(str);

    }
}
