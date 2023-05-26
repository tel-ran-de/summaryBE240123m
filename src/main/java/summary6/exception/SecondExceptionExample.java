package summary6.exception;

public class SecondExceptionExample {
    public static void main(String[] args) {

        try {
            System.out.println(divide(4, 2));
            System.out.println(divide(0, 2));
            System.out.println(divide(4, 0));
        } catch (ArithmeticException exception) {
            System.out.println("Ошибка деления!");
        }


        System.out.println("Finish!");


    }
    public static double divide(int x, int y){
        double result =  x / y;
        return result;
    }
}
