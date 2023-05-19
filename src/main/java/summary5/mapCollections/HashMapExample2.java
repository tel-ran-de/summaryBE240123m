package summary5.mapCollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
    public static void main(String[] args) {
        Map<String,Integer> mapCollection = new HashMap<>();

        mapCollection.put("Ruslan",30);
        mapCollection.put("Victor",25);
        mapCollection.put("Elene",18);
        mapCollection.put("John",45);
        mapCollection.put("Ruslan",35);

        System.out.println(mapCollection);


    }
}
