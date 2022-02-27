package lesson8;

public class NewString {
    public static void codePrinting(String string) {
        int stringLength = string.length();
        for (int i = 0; i < stringLength; i++) {
            System.out.println("Символ - " + string.charAt(i) + ", Его код - " +(int) string.charAt(i));
        }
    }
}