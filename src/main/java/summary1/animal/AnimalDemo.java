package summary1.animal;

public class AnimalDemo {
    public static void main(String[] args) {

        Dog firstAnimal = new Dog();
        Fish secondAnimal = new Fish();
        Worm thirdAnimal = new Worm();

        firstAnimal.breath();
        secondAnimal.breath();
        thirdAnimal.breath();

        System.out.println();

        Animal[] animals = {firstAnimal,secondAnimal,thirdAnimal};

        for (int i = 0; i < animals.length; i++) {
            animals[i].breath();
        }

        firstAnimal.voice();

    }
}
