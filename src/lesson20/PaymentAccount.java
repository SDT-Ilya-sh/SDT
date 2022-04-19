package lesson20;

public class PaymentAccount {
    public int moneyAmount;

    PaymentAccount()
    {
        this.moneyAmount = 0;
    }
    public int getMoneyAmount()
    {
        return moneyAmount;
    }
    public void setMoneyAmount(int moneyAmount)
    {
        this.moneyAmount = moneyAmount;
    }
    public void moneyDeposit(int amount)
    {
        this.moneyAmount+=amount;
    }
    public void withDrawFunds(int withDrawAmount)
    {
        if(withDrawAmount<=getMoneyAmount()) {
            this.moneyAmount -= withDrawAmount;
        }
        else System.out.println("Недостаточно средств!");
    }
}
