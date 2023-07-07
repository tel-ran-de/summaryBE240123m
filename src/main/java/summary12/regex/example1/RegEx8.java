package summary12.regex.example1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx8 {
    public static void main(String[] args) {

        String inputString = "java,  programming language? the% best. in the World! anotherWord";

        // -----------
        //String[] words = inputString.split(" ");

        String[] words = inputString.split("!+|\\W*\\s+");



        System.out.println(Arrays.toString(words));



    }
}
