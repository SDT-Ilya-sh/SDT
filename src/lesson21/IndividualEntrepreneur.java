package lesson21;

public class IndividualEntrepreneur extends Clients {

    @Override
    public void withDrawFounds(double withDrawAmount) {
        if (withDrawAmount < 1000 && withDrawAmount < getPaymentAccount()) {
            setPaymentAccount(getPaymentAccount() + (0.99 * withDrawAmount));
        } else if (withDrawAmount > 1000 && withDrawAmount < getPaymentAccount()) {
            setPaymentAccount(getPaymentAccount() + (0.995 * withDrawAmount));
        }
        else System.out.println("Недостаточно средств!");
    }
}
