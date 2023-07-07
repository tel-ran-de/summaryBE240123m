package summary12.regex.example1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExMatches2 {
    public static void main(String[] args) {

        System.out.println(checkMail("google.com"));
        System.out.println(checkMail("reference.ua"));
        System.out.println(checkMail("reference2.lv32"));
        System.out.println(checkMail("reference3.org"));
    }

    public static boolean checkMail(String inputString){


        // -----------
       String regEx = "\\w+\\.(com|ua|lv(\\d{1,2})?)";



        //------

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(inputString);
        return matcher.matches();
    }
}
