package lesson18;

public class PhoneFormatting {
    public static String phoneFormat(String phone) {
        String phoneNumber = phone.replaceAll("[^0-9]", "");
        StringBuilder newPhoneNumber = new StringBuilder(phoneNumber);
        newPhoneNumber.replace(0, 1, "7");
        newPhoneNumber.insert(0, "+");
        newPhoneNumber.insert(2, " ");
        newPhoneNumber.insert(3, "(");
        newPhoneNumber.insert(7, ")");
        newPhoneNumber.insert(8, " ");
        newPhoneNumber.insert(12, "-");
        newPhoneNumber.insert(15, "-");
        return String.valueOf(newPhoneNumber);
    }
}
