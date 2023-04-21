package summary1.shape;

import java.util.Arrays;

public class ShapeDemo {
    public static void main(String[] args) {

        ShapeUtil su = new ShapeUtil();
        Circle[] circles = {
                new Circle("A", 2),
                new Circle("B", 5),
                new Circle("C", 10)
        };

        System.out.println(Arrays.toString(circles));

        Square[] squares = {
                new Square("A", 10),
                new Square("B", 20),
                new Square("C", 30)
        };

        System.out.println(Arrays.toString(squares));

        double sumCirclesArea = su.sumAreas(circles);

        System.out.println("Sum all circles areas is " + sumCirclesArea);

        System.out.println("Sum all squares areas is " + su.sumAreas(squares));


    }
}
