package lesson10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameLogic {
    public static void nameTyping(String string) {
        Pattern pattern = Pattern.compile("(\\b[а-яА-я]+?\\b)");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            if (Log.getConstCount() == 3) {
                break;
            }
            System.out.println(Log.constArray[Log.getConstCount()] + matcher.group(1));
            Log.setConstCount(Log.getConstCount() + 1);
        }
    }
}



