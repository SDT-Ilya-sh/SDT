package lesson17;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> mailList = new HashSet();
        EmailList newList = new EmailList();
        newList.listCall(mailList);
    }
}
