package lesson10;

public class Log {
    private static final String SURNAME = "Фамилия: ";
    private static final String NAME = "Имя: ";
    private static final String SECOND_NAME = "Отчество: ";
    private static int constCount;

    public static void setConstCount(int constCount) {
        Log.constCount = constCount;
    }

    static String[] constArray = {SURNAME, NAME, SECOND_NAME};

    public static int getConstCount() {
        return constCount;
    }

    public String[] getConstArray() {
        return constArray;
    }
}
