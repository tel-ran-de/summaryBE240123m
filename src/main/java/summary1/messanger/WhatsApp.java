package summary1.messanger;

public class WhatsApp implements Messenger {


    @Override
    public void sendMessage() {
        System.out.println("WhatsApp messenger send message!");
    }

    @Override
    public void getMessage() {
        System.out.println("WhatsApp messenger get message!");
    }
}
