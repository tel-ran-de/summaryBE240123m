package summary5.treeSet.comparable;

public class Phones implements Comparable<Phones> {
    String model;

    public Phones(String model) {
        this.model = model;
    }

    @Override
    public int compareTo(Phones phones) {
        return model.compareTo(phones.model);
    }

    @Override
    public String toString() {
        return "Phones{" +
                "model='" + model + '\'' +
                '}';
    }
}
