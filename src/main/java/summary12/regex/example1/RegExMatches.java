package summary12.regex.example1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExMatches {
    public static void main(String[] args) {

        String inputString = "This is order was places for QT2000! OK?";

        // -----------
        String regEx = "(.*?)(\\d+)([&^%$]*)";

        //------

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(inputString);

        while (matcher.find()) {
            System.out.println("'" + inputString.substring(matcher.start(), matcher.end()) + "'");
            System.out.println("Start: " + matcher.start());
            System.out.println("End: " + matcher.end());
        }

        System.out.println("============");

        matcher = pattern.matcher(inputString);

        System.out.println(matcher.groupCount());



        if (matcher.find()) {

            for (int i = 0; i <= matcher.groupCount(); i++) {
                System.out.println("Found value: " + matcher.group(i));
            }
        } else {
            System.out.println("NO MATCH!");
        }



    }
}
