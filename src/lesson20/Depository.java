package lesson20;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;

public class Depository extends PaymentAccount {
    Calendar calendar = Calendar.getInstance();
    LocalDate depositDay;
    LocalDate localDate = LocalDateTime.ofInstant(calendar.toInstant(), calendar.getTimeZone().toZoneId()).toLocalDate();

    Depository() {}

    public void moneyDeposit(int amount, LocalDate depositDay) {
        this.depositDay = depositDay;
        this.moneyAmount += amount;
    }

    @Override
    public void withDrawFunds(int withDrawAmount) {

        if (isWithdrawAvailable(depositDay, localDate) && withDrawAmount <= getMoneyAmount()) {
            this.moneyAmount -= withDrawAmount;
            System.out.println("Вывод произведен успешно!");
        } else System.out.println("Вывод невозможен");
    }

    public boolean isWithdrawAvailable(LocalDate firstDate, LocalDate secondDate) {
        Period period = Period.between(secondDate, firstDate);
        return period.getMonths() < 0;
    }
}
