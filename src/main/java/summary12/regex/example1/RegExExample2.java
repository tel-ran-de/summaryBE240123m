package summary12.regex.example1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExample2 {
    public static void main(String[] args) {
        String inputString = "This is example that contaiwwwns number +3805050.55055 this is great!";

        String patt = "\\+\\d+\\.\\d+";
        String patt2 ="www.*";

        Pattern pattern = Pattern.compile(patt);
        Matcher matcher = pattern.matcher(inputString);

        if (matcher.find()){
            System.out.println("Phone number: " + matcher.group());
        } else {
            System.out.println("Phone number not found!");
        }

    }
}
