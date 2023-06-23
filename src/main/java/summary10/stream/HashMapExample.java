package summary10.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> ourMap = new HashMap<>();
        ourMap.put("one", 1);
        ourMap.put("two", 2);
        ourMap.put("three", 3);
        ourMap.put("four", 4);
        ourMap.put("five", 5);

        // печать значений
        ourMap.forEach((key,value) -> System.out.println(key + " " + value));

        // фильтр на значение

        Map<String , Integer> filteredMap = ourMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(filteredMap);

        Map<Integer , String> transformedMap = ourMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 3)
                .collect(Collectors.toMap(entry -> entry.getValue(), entry -> " Value " + entry.getKey()));

        System.out.println(transformedMap);

        int sum = ourMap.values().stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of all elements: " + sum);

    }
}
