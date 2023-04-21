package summary1.messanger;

public class Viber implements Messenger{


    @Override
    public void sendMessage() {
        System.out.println("Viber messenger send message!");
    }

    @Override
    public void getMessage() {
        System.out.println("Viber messenger get message!");
    }
}
