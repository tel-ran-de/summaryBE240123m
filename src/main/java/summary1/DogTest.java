package summary1;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();

        //dog.voice();

        CatDog catDog = new CatDog();

        catDog.catDogVoice();

        System.out.println("=====");
        catDog.voice();
    }
}
