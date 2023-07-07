package summary12.regex.example1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx5 {
    public static void main(String[] args) {

        String inputString = "Hello, World!";

        // -----------
        String regEx = "^Hello";

        /*
        ^[A-Z] - строка начинается] с любой большой буквы
        ^\\d+ - начинается с одной или более цифр
        ^[a-zA-Z0-9]+ - начинается с одной или более буквы/цифры abc1223 или Hello, 1abc23

         */



        //------

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(inputString);

        int matchCount = 0;

        while (matcher.find()) {
            matchCount++;

            System.out.println("'" + inputString.substring(matcher.start(), matcher.end()) + "'");
            System.out.println("Start: " + matcher.start());
            System.out.println("End: " + matcher.end());
            System.out.println("Number of match: " + matchCount);
        }


    }
}
