package summary11.streamPractice3;

import java.util.Arrays;
import java.util.List;

public class StreamExample3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int sum = numbers.stream()
                .reduce(10,(acc,streamElement) -> acc + streamElement);

        System.out.println(sum);


        List<String> stringList = Arrays.asList("Hello"," ",", "," world","!");
        String result = stringList.stream()
                .reduce("",(acc,streamElement) -> acc + streamElement);

        System.out.println(result);
    }
}
