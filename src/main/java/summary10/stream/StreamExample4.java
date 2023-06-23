package summary10.stream;

import java.util.Arrays;
import java.util.List;

public class StreamExample4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("BigBen", "BigBob", "Big", "Bob", "Big Bob");
        System.out.println(list.stream()
                .filter(str -> str.equals("Big"))
                .count());


        List<String> list2 = Arrays.asList("a1", "b5", "a2", "b4", "c1", "a1", "b5");
        System.out.println(list2.stream()
                .min(String::compareTo)
                .get());

        List<String> list3 = Arrays.asList("a1", "b5", "a2", "b4", "c1", "a1", "b5");

        List<String> result3 = list3.stream()
                .sorted()
                .distinct()
                .toList();

        System.out.println(result3);

        List<String> list4 = Arrays.asList("a1", "b5", "a2", "b4", "c1", "a1", "b5");
        List<String> result4 = list4.stream()
                .sorted((o1,o2) -> (-1)*(o1.compareTo(o2)))
                .distinct()
                .toList();

        System.out.println(result4);
    }
}
