package summary11;

import javax.sound.midi.Soundbank;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteExample {
    public static void main(String[] args) throws IOException {

        writeExample();
        readExample();

    }

    public static void writeExample() throws IOException {
        // пример чтения из файла

        String path = "src/main/java/summary11/src_test.txt";
        FileOutputStream out = new FileOutputStream(path);
        //String text = "\nHello from java outputstream!";
        String text = "\nПривет от java outputstream!";

        out.write(text.getBytes());
        out.close();

    }
    public static void readExample() throws IOException {
        // пример чтения из файла

        String path = "src/main/java/summary11/src_test.txt";
        FileInputStream input = new FileInputStream(path);

        int data = input.read();

        while (data != -1) {
            System.out.print((char) data + " ");
            data = input.read();
        }

        input.close();
    }
}
