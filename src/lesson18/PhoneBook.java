package lesson18;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

    private final Scanner scanner = new Scanner(System.in);

    public void bookCall(HashMap<String, String> contactBook) {
        while (true) {
            System.out.println("Введите номер телефона или Имя Абонента : ");
            String input = scanner.nextLine();
            if (input.contains("LIST")) {
                printMap(contactBook);
                continue;
            }
            if (PhoneCheck.phoneCheck(input)) {
                String formattedPhone = PhoneFormatting.phoneFormat(input);
                if (contactBook.containsKey(formattedPhone)) {
                    System.out.println(contactBook.get(formattedPhone));
                } else {
                    System.out.println("Введите имя абонента для добавления в записную книгу: ");
                    String name = scanner.nextLine();
                    contactBook.put(formattedPhone, name);
                }
            } else if (contactBook.containsValue(input)) {
                System.out.println(getkey(contactBook, input));
                continue;
            } else {
                System.out.println("Введите номер абонента : ");
                String phoneToAdd = scanner.nextLine();
                contactBook.put(PhoneFormatting.phoneFormat(phoneToAdd), input);
            }
            if (input.contains("EXIT")) {
                break;
            }

        }
    }

    private String getkey(HashMap<String, String> contactBook, String input) {
        for (String keyCheck : contactBook.keySet()) {
            if (contactBook.get(keyCheck).equals(input)) {
                return keyCheck;
            }
        }
        return null;
    }

    private void printMap(HashMap<String, String> map) {
        for (String k : map.keySet()) {
            System.out.println(k + " => " + map.get(k));
        }
    }
}
