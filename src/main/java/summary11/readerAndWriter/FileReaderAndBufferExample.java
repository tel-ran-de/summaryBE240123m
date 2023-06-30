package summary11.readerAndWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderAndBufferExample {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("test_stream.txt");

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        int counter = 0 ;

        while ((line = bufferedReader.readLine()) != null) {
            counter++;
            System.out.println("Line #" + counter + " : " + line);
        }



    }
}
