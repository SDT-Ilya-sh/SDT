package lesson5;

public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;
        System.out.println(sumDigits(489));

    }

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
