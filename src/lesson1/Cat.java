package lesson1;

import lesson2.Car;

public class Cat
{
    public final int EYES_AMOUNT = 2;
    public final int PAW_AMOUNT = 4;
    public final double MIN_WEIGHT = 1000;
    public final double MAX_WEIGHT = 9000.0;
    public static int count=0;
    private double originWeight;
    private double weight;
    private double minWeight;
    private double maxWeight;
    public String catColor;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = MIN_WEIGHT;
        maxWeight = MAX_WEIGHT;
        count++;

    }
    public  Cat getclone()
    {
        Cat cat = new Cat();
        cat.weight = weight;
        cat.minWeight = MIN_WEIGHT;
        cat.maxWeight = MAX_WEIGHT;
        cat.catColor = catColor;
        return cat;
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
    public static Cat getKitten()
    {
        Cat kitten = new Cat(1100.00);
        return kitten;

    }
    public Double getWeight()
    {
        return weight;
    }

}