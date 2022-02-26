package lesson11;

public class PhoneNumber {
    public static void insertPhoneNumber(String string){
        String phoneNumber = string.replaceAll("[^0-9]","");
        if (phoneNumber.length() == 11) {
            StringBuilder newPhoneNumber = new StringBuilder(phoneNumber);
            newPhoneNumber.replace(0,1,"7");
            newPhoneNumber.insert(0, "+");
            newPhoneNumber.insert(2, " ");
            newPhoneNumber.insert(3, "(");
            newPhoneNumber.insert(7, ")");
            newPhoneNumber.insert(8, " ");
            newPhoneNumber.insert(12, "-");
            newPhoneNumber.insert(15, "-");
            System.out.println("Номер телефона Абонента - " + newPhoneNumber);
        }
        else System.out.println("Данные введены неверно!");
    }
}
