package summary11.readerAndWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer= new BufferedWriter(new FileWriter("writerExample.txt"));

        writer.newLine();
        writer.write("Hello, world!");
        writer.newLine();
        writer.newLine();
        writer.newLine();
        writer.newLine();
        writer.write("This is our example working bufferWriter");
       // writer.flush();
        writer.close();

    }
}
