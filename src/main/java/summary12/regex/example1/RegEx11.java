package summary12.regex.example1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx11 {
    public static void main(String[] args) {

        /*
        написать регулярное выражение которое соответствует любому номеру телефона,
         который может быть представлен в виде :

         1) 7 последовательных цифр
         2) 3 цифры пробел и еще 4 цифры
         3) 3 цифры пробел или '-' и еще 4 цифры
         4) +(от 1 до 4 цифр кода в скобках) "пробел" 3 цифры "-" и еще 4 цифры (всего 11 цифр)
         5) + 1 цифра (от 1 до 3 цифр кода в скобках) "пробел" 3 цифры "-" и еще 4 цифры (всего 11 цифр)


         */

       String telNumberFormat1 = "1231234";
       String telNumberFormat2 = "123 1234";
       String telNumberFormat3 = "123-1234";
       String telNumberFormat4 = "+(1234) 123-1234";
       String telNumberFormat5 = "+1 (123) 123-1234";


        // -----------
        String regEx = "(\\+\\([0-9]{1,4}\\)\\s|\\+[0-9]\\s\\([0-9]{1,3}\\)\\s)?\\d{3}[-\\s]?[0-9]{4}";
        //------------

        Pattern pattern = Pattern.compile(regEx);


        Matcher matcher1 = pattern.matcher(telNumberFormat1);
        System.out.println(telNumberFormat1 + " is correct? - " + matcher1.matches());

        Matcher matcher2 = pattern.matcher(telNumberFormat2);
        System.out.println(telNumberFormat2 + " is correct? - " + matcher2.matches());

        Matcher matcher3 = pattern.matcher(telNumberFormat3);
        System.out.println(telNumberFormat3 + " is correct? - " + matcher3.matches());

        Matcher matcher4 = pattern.matcher(telNumberFormat4);
        System.out.println(telNumberFormat4 + " is correct? - " + matcher4.matches());

        Matcher matcher5 = pattern.matcher(telNumberFormat5);
        System.out.println(telNumberFormat5 + " is correct? - " + matcher5.matches());



    }
}
