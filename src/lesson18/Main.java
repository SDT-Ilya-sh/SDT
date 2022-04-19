package lesson18;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();
        PhoneBook newBook = new PhoneBook();
        newBook.bookCall(contacts);
    }
}
