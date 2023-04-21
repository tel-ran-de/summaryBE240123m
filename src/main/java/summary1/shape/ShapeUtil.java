package summary1.shape;

public class ShapeUtil {

    public double sumAreas(Shape[] shapes){
        double sumAreas = 0;
        for (int i = 0; i < shapes.length; i++) {
            sumAreas = sumAreas +shapes[i].calculateArea();
        }
        return sumAreas;
    }
}
