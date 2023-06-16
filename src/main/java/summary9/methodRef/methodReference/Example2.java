package summary9.methodRef.methodReference;

import java.util.function.Function;

public class Example2 {
    public static void main(String[] args) {

        Function<String, Integer> toInteger = string -> parse(string);
        Integer integer = toInteger.apply("5");
        System.out.println(integer);


        Function<String, Integer> toInteger2 = Example2::parse;
        Integer integer2 = toInteger2.apply("15");



    }

    private static Integer parse (String str){
        return  Integer.parseInt(str);
    }

}
