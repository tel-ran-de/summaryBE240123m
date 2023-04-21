package summary1.animal;

public class Dog extends Animal{
    @Override
    void breath() {
        System.out.println("Lungs");
    }

    public void voice(){
        System.out.println("GAV!!!" + super.intData);
    }
}
