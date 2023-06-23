package summary10.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("10","20","1","10","25","50","20","10");
        System.out.println("Original: " + stringList);

        // filtered && count

        String checkElement = "10";

        long resultCount = stringList.stream()
                .filter(str -> str.equals(checkElement))
                //.peek(System.out::println)
                .count();

        System.out.println("Result of filtering and counting: " + resultCount);


        // sorted

        List<String> result2 = stringList.stream()
                .sorted((s1,s2) -> s2.compareTo(s1))
                .toList();

        System.out.println("Result of sorting: " + result2);


//        stringList.sort((s1,s2)-> s2.length() - s1.length());
//        System.out.println(stringList);

       // stringList.sort(Comparator.reverseOrder());


        // sorted && limit

        List<String> result3 = stringList.stream()
                .sorted()
                .limit(3)
                .toList();

        System.out.println("Result of sorting and limit(3): " + result3);

        // sorted && skip

        List<String> result4 = stringList.stream()
                .sorted()
                .skip(3)
                .toList();

        System.out.println("Result of sorting and skip(3): " + result4);

        //distinct and sorted
        List<String> result5 = stringList.stream()
                .sorted()
                .distinct()
                .toList();

        System.out.println("Result of sorting and distinct: " + result5);


        Set<String> result51 = stringList.stream()
                .collect(Collectors.toSet());
        System.out.println(result51);


        //peek

        System.out.println("Result of peek method:");
        stringList.stream()
                .peek(e -> System.out.println(e + " hello!"))
                .toList();

        System.out.println();

        // map
        System.out.println("Result of map method:");
        stringList.stream()
                .map(x -> x + " times")
                .forEach(msg -> System.out.print(msg + ", "));

        System.out.println();



    }
}
