package lesson16;

public class ExtractingEditNumber {


    public static String extractNumber(String string) {
        boolean found = false;
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (Character.isDigit(c)) {
                stringBuilder.append(c);
                found = true;
            } else if (found) {
                break;
            }
        }
        return stringBuilder.toString();
    }
}
