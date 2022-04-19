package lesson18;

public class PhoneCheck {
    private static boolean isPhone = false;

    public static boolean phoneCheck(String phone) {
        String phoneNumber = phone.replaceAll("[^0-9]", "");
        if (phoneNumber.length() == 11) {
            isPhone = true;
        }
        return isPhone;
    }
}
