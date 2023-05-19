package summary5.hashCode;

public class CarEquals {
    public static void main(String[] args) {

        Car car1 = new Car("BMW");
        Car car2 = new Car("Mercedes");
        Car car3 = new Car("BMW");

        System.out.println(car1.equals(car3));
    }
}
