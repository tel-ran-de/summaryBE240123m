package summary11.serializableExample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableExample {
    public static void main(String[] args) {
        Person person = new Person("Ruslan", 30);

        // Cериализация

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("person.data");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(person);
            System.out.println("Наш экземпляр класса Person сохранен в файл");
        } catch (IOException e) {}

    }
}
