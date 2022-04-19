package lesson21;

public class NaturalPerson extends Clients {

    @Override
    public void withDrawFounds(double withDrawAmount) {
        if (withDrawAmount < getPaymentAccount()) {
            setPaymentAccount(getPaymentAccount() - withDrawAmount);
        }
        else System.out.println("Недостаточно средств!");
    }
}
