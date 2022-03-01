package lesson17;

import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {

    private final Scanner scanner = new Scanner(System.in);

    public void listCall(HashSet<String> hashSet) {
        while (true) {
            System.out.println("Введите комманду : ");
            String input = scanner.nextLine();
            Pattern pattern = Pattern.compile("([a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+)");
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                hashSet.add(matcher.group(1));
            }
            if (input.contains("LIST")) {
                listPrint(hashSet);
            }
            if (input.contains("EXIT")) {
                break;
            }
        }
    }

    private void listPrint(HashSet<String> hashSet) {
        int n = 1;
        for (String s : hashSet) {
            System.out.println("E-mail номер " + n + " " + s);
            n++;
        }
    }

}
