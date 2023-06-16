package summary9.standartFunctionInterfaces;


import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (x, y) -> x*y;

        System.out.println(multiply.apply(3,5));
        System.out.println(multiply.apply(-2,10));

    }
}
