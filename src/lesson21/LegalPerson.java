package lesson21;

public class LegalPerson extends Clients {

    @Override
    public void withDrawFounds(double withDrawAmount) {
        if (withDrawAmount < getPaymentAccount()) {
            setPaymentAccount(getPaymentAccount() - (1.01 * withDrawAmount));
        }
        else System.out.println("Недостаточно средств!");
    }
}
