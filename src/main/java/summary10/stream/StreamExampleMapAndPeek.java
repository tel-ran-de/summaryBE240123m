package summary10.stream;

import java.util.Arrays;
import java.util.List;

public class StreamExampleMapAndPeek {
    public static void main(String[] args) {

//        Stream<Integer> myStream = Stream.of(1,2,3,4,5,6,7);
//        Stream<Double> myStream2 = Stream.generate(Math::random);


        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .toList();

        System.out.println(squares);



         numbers.stream()
                .peek(System.out::println)
                .toList();




    }
}
