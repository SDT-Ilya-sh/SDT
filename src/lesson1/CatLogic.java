package lesson1;

public class CatLogic
{
    public static int count=0;
    private double originWeight;
    private double weight;
    private double minWeight;
    private double maxWeight;
    public String catColor;
    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }
    public void feed(Double amount)
    {
        if(weight > maxWeight) {
            count=count-1;
            System.out.println("Your cat is fucking dead, it can`t eat!");
        }
        else
            weight = weight + amount;

    }

    public void drink(Double amount)
    {

        if(weight < minWeight) {
            count=count-1;
            System.out.println("Your cat is fucking dead, it can`t drink!");
        }
        else
            weight = weight + amount;

    }
    public String getStatus()
    {
        if(weight < minWeight) {
            count=count-1;
            return "Dead";
        }
        else if(weight > maxWeight) {
            count--;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}
