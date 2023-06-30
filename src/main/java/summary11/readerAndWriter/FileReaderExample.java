package summary11.readerAndWriter;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("test_stream.txt");

        int ch;

        while ((ch = fileReader.read()) != -1) {
            System.out.println((char) ch);
        }



    }
}
