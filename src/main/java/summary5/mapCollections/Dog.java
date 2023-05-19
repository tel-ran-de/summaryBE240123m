package summary5.mapCollections;

public class Dog {
    String breed;
    int age;

    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
