package summary1.messanger;

public class MessangerDemo {
    public static void main(String[] args) {
        Messenger[] messengers = new Messenger[6];

        Telegramm telegramm1 = new Telegramm();


        messengers[0] = telegramm1;
        messengers[1] = new WhatsApp();
        messengers[2] = new Viber();
        messengers[3] = new Viber();
        messengers[4] = new Telegramm();
        messengers[5] = new WhatsApp();


        System.out.println(telegramm1);
        System.out.println(messengers[0]);

        Telegramm telegramm2 = (Telegramm) messengers[0];
        System.out.println(telegramm2);


        for (int i = 0; i < messengers.length; i++) {
            messengers[i].getMessage();
        }



    }
}
