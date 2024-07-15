//Find valid date (MMDDYYYY) from string.
//For example :-
//Hdjsh asd2324234jghjsd hjsdg sdhk 12212021 idf32432 32423 d34234jh dfh

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Second {
    public static void main(String[] args) {
        String input = "Hdjsh asd2324234jghjsd hjsdg sdhk 12212021 idf32432 32423 d34234jh dfh";

        String datePattern = "(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])\\d{4}";

        Pattern pattern = Pattern.compile(datePattern);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Found date: " + matcher.group());
        }
    }
}
