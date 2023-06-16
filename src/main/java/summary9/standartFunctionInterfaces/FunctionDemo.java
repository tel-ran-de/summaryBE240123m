package summary9.standartFunctionInterfaces;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, String> convert = x -> String.valueOf(x) + " евро";
        System.out.println(convert.apply(50));
    }
}
