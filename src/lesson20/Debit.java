package lesson20;

public class Debit extends PaymentAccount
{
    public void withDrawFunds(int withDrawAmount)
    {
        if(withDrawAmount<=getMoneyAmount()) {
            this.moneyAmount -= 1.01 * withDrawAmount;
            System.out.println("Вывод произведен успешно!");
        }
        else System.out.println("Недостаточно средств!");
    }
}
