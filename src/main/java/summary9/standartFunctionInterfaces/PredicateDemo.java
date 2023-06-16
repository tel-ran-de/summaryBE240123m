package summary9.standartFunctionInterfaces;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> isPositiveAndOdd = x -> {

            boolean testResult =  ((x > 0) && (x % 2 == 0));

           return testResult;
        };
        System.out.println(isPositiveAndOdd.test(10));
        System.out.println(isPositiveAndOdd.test(5));
        System.out.println(isPositiveAndOdd.test(-2));
    }
}
