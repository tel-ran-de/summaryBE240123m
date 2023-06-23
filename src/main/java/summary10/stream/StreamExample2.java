package summary10.stream;

import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("10","20","1","10","25","50","20","10");
        System.out.println("Original: " + stringList);

        // filtered && count

        String checkElement = "10";

        long resultCount = stringList.stream()
                .filter(str -> str.equals(checkElement))
                .count();




    }
}
