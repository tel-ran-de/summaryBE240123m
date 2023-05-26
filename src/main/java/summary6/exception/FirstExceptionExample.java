package summary6.exception;

public class FirstExceptionExample {
    public static void main(String[] args) {

        System.out.println(divide(4,2));
        System.out.println(divide(0,2));
        System.out.println(divide(4,0));


        System.out.println("Finish!");


    }
    public static double divide(int x, int y){
        double result =  x / y;
        return result;
    }
}
