package summary3.lessoncode;

public class ArrayElement {
    int age;
    String name;
    double weight;

    public ArrayElement(int age, String name, double weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ArrayElement{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
