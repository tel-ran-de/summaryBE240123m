package summary12.regex.example1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx3 {
    public static void main(String[] args) {

        String inputString = "code 2 learn java regex";

        // -----------
        String regEx = "[a-j]+";

        //------

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(inputString);

        int matchCount = 0;

        while (matcher.find()) {
            matchCount++;

            System.out.println("' " + inputString.substring(matcher.start(), matcher.end()) + "'");
            System.out.println("Start: " + matcher.start());
            System.out.println("End: " + matcher.end());
            System.out.println("Number of match: " + matchCount);
        }


    }
}
