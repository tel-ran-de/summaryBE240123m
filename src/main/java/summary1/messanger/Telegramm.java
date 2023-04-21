package summary1.messanger;

public class Telegramm implements Messenger{


    @Override
    public void sendMessage() {
        System.out.println("Telegramm messenger send message!");
    }

    @Override
    public void getMessage() {
        System.out.println("Telegramm messenger get message!");
    }

    public void telegrammGreeting(){
        System.out.println("Hello! This is Telegramm!!!!");
    }
}
