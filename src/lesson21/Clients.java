package lesson21;

public abstract class Clients {
    private double paymentAccount;

    public void depositMoney(double amount) {
        paymentAccount += amount;
    }

    public double getPaymentAccount() {
        return paymentAccount;
    }


    public void setPaymentAccount(double moneyAmount) {
        this.paymentAccount = moneyAmount;
    }

    public abstract void withDrawFounds(double withDrawAmount);
}
