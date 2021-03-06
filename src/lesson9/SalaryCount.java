package lesson9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SalaryCount {

    public static void setSalary(String string) {
        Pattern pattern = Pattern.compile("(\\d+)");
        Matcher matcher = pattern.matcher(string);
        int salary = 0;
        while (matcher.find()) {
            salary += Integer.parseInt(matcher.group(1));
        }
        System.out.println(salary);
    }
}
