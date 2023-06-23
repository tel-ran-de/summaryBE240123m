package summary10.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Collections", "Array", "Stream", "System");

        List<String> result = words.stream()
                .filter(s -> s.startsWith("S"))
                .toList();


        System.out.println(result);
    }
}
