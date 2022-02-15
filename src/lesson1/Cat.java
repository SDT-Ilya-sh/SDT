package lesson1;

public class Cat
{
    public static final int EYES_AMOUNT = 2;
    public static final int PAW_AMOUNT = 4;
    public static final double MIN_WEIGHT = 1000;
    public static final double MAX_WEIGHT = 9000.0;
    public static int count=0;
    private double originWeight;
    private double weight;
    private double minWeight;
    private double maxWeight;
    public String catColor;

    int a = 2;


    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = MIN_WEIGHT;
        maxWeight = MAX_WEIGHT;
        count++;

    }
    public Cat (String color)
    {
        this();
        this.catColor=color;
    }
    public String getCatColor(){
        return  catColor;
    }

    public static int getCount()
    {
        return count;
    }



    public Cat(double weight)
    {
        this();
        this.weight = weight;
    }




    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }


    public static Cat getKitten()
    {
        Cat kitten = new Cat(1100.00);
        return kitten;

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

    public Double getWeight()
    {
        return weight;
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