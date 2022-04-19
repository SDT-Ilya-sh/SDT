package lesson21;

public class Main {
    public static void main(String[] args) {
        Clients zhenya = new NaturalPerson();
        zhenya.depositMoney(1500.00);
        zhenya.withDrawFounds(2500);
        System.out.println(zhenya.getPaymentAccount());
    }
}
