package lesson20;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Depository depository = new Depository();
        depository.moneyDeposit(1000, LocalDate.of(2022,2,2));
        depository.withDrawFunds(500);
        System.out.println("Баланс депозитарного счета : " + depository.getMoneyAmount());
        Debit debitCard = new Debit();
        debitCard.moneyDeposit(1000);
        debitCard.withDrawFunds(500);
        System.out.println("Баланс дебетовой карты : " + debitCard.getMoneyAmount());
    }
}
