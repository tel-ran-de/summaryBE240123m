package summary1.shape;

public class Square extends Shape{

    private double sideA;

    public Square(String name, double sideA) {
        super(name);
        this.sideA = sideA;
    }

    @Override
    double calculateArea() {
        return sideA * sideA;
    }
}
