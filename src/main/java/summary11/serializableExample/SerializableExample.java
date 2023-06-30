package summary11.serializableExample;

import java.io.*;

public class SerializableExample {
    public static void main(String[] args) {
        Person person = new Person("Ruslan", 30);

        // Cериализация

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("person.data");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(person);
            System.out.println("Наш экземпляр класса Person сохранен в файл");
            outputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {}


        // Десериализация

        try {
            FileInputStream fileInputStream = new FileInputStream("person.data");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Person desPerson = (Person) objectInputStream.readObject();
            System.out.println("Наш экземпляр класса Person восстановлен");
            System.out.println("Name: " + desPerson.getName());
            System.out.println("Age: " + desPerson.getAge());
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {} catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
