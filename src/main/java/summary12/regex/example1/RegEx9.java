package summary12.regex.example1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx9 {
    public static void main(String[] args) {

        String inputString = "name245@gmail.com name@cyprus.com.cy name246@yahoo.com name247@mail.de";

        // -----------
        String regEx = "\\w+@\\w+\\.[A-Za-z]{2,3}(\\.[A-Za-z]{2,3})?";

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
