package summary12.regex.example1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx6 {
    public static void main(String[] args) {

        String inputString = "cat cat23 cat23_super catttti5_5e cat7.6";

        // -----------
        String regEx = "cat\\w*\\.?\\w*";

/*
или String regEx = "cat\\S*";
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
