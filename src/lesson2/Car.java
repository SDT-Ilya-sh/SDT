package lesson2;

public class Car {
    public static String number;
    public static int height;
    public static double weight;
    public static boolean hasVehicle;
    public static boolean isSpecial;


    public void setNumber(String number)
    {

        this.number = number;
    }
    public static  String getNumber()
    {
        return number;
    }
    public void  setHeight(int height)
    {
        this.height = height;
    }
    public static int getHeight()
    {
        return height;
    }
    public void  setWeight(Double weight)
    {
        this.weight = weight;
    }
    public static double getWeight()
    {
        return weight;
    }
    public void  setHasVehicle(boolean hasVehicle)
    {
        this.hasVehicle = hasVehicle;
    }
    public static boolean getHasVehicle()
    {
        return hasVehicle;
    }
    public void  setIsSpecial(boolean isSpecial)
    {
        this.isSpecial = isSpecial;
    }
    public static boolean getIsSpecial()
    {
        return isSpecial;
    }



    public String toString() {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}