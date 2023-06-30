package summary11;

import java.io.File;
import java.util.Arrays;

public class FileAndDirExample {
    public static void main(String[] args) {
        File file = new File("test.txt");
        boolean isExist = file.exists();
        System.out.println("Файл существует? - " + isExist);


        file = new File("new_dir");
        boolean wasCreated = file.mkdir();
        System.out.println("Directory was created: " + wasCreated);

        File directory = new File("src/main/java/summary8");
        boolean isDirectory = directory.isDirectory();
        System.out.println(isDirectory);

        String[] fileNames = directory.list();

        System.out.println(Arrays.toString(fileNames));

        File[] files = directory.listFiles();
        System.out.println(Arrays.toString(files));

    }
}
