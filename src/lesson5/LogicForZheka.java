package lesson5;

public class LogicForZheka {
    public static int sumDigits(Integer number)
    {
        int sum = 0;
        String numberToString = number.toString();
        for (int i=0;i < numberToString.length(); i++){
            String charNumber = String.valueOf(numberToString.charAt(i));
            int stringNumber = Integer.parseInt(charNumber);
            sum+=stringNumber;
        }
        return sum;
    }

}
