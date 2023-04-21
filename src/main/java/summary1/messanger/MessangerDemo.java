package summary1.messanger;

public class MessangerDemo {
    public static void main(String[] args) {
        Messenger[] messengers = new Messenger[6];

        messengers[0] = new Telegramm();
        messengers[1] = new WhatsApp();
        messengers[2] = new Viber();
        messengers[3] = new Viber();
        messengers[4] = new Telegramm();
        messengers[5] = new WhatsApp();

        for (int i = 0; i < messengers.length; i++) {
            messengers[i].getMessage();
        }

    }
}
