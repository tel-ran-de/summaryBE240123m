package summary1;

public class CatDog extends Dog {
    public void catDogVoice(){
        System.out.println("-------------");
        System.out.println("Use parent method 'voice'");
        super.voice();
        System.out.println("CatDog crazy voice!!!");
    }

    @Override
    public void voice(){
        System.out.println("New version voice method");
    }
}
