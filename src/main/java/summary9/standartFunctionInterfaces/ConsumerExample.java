package summary9.standartFunctionInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Integer> printer = x -> System.out.printf("%d евро \n", x);

        printer.accept(600);
    }
}
