package summary9.standartFunctionInterfaces;


import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = x -> x*x;

        System.out.println(square.apply(5));


    }
}
