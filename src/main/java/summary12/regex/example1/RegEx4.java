package summary12.regex.example1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx4 {
    public static void main(String[] args) {

        String inputString = "привет Антон Александр Алла Андрей";

        // -----------
        String regEx = "А.+а";  //  жадный режим
        String regEx2 = "А.+?а"; // ленивый режим


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
