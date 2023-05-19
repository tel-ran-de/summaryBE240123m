package summary5.iterator;

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nCat{" +
                "name='" + name + '\'' +
                "}";
    }
}
