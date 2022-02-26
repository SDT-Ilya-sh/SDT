package lesson12;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class BirthDay {
    private static int firstBirthday = 1;

    public static void getBirthDays(int age, int year, int month, int day) {
        DateFormat df = new SimpleDateFormat("EEEE");
        Calendar birthDay = Calendar.getInstance();
        birthDay.set(year, month - 1, day);
        for (int i = 0; i < age; i++) {
            birthDay.set(year + i, month-1, day);
            System.out.println( firstBirthday + " День рождения - " + df.format(birthDay.getTime()));
            firstBirthday++;
        }
    }
}
