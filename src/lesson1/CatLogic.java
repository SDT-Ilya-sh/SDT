package lesson1;


public class CatLogic
{

    public static void meow(Cat cat)
    {

        cat.setWeight(cat.getWeight() - 1) ;
        System.out.println("Meow");
    }
    public static void feed(Cat cat, Double amount)
    {
        if(cat.getWeight() > cat.MAX_WEIGHT) {
            Cat.count=Cat.count-1;
            System.out.println("Your cat is fucking dead, it can`t eat!");
        }
        else
            cat.setWeight(cat.getWeight() + amount);

    }

    public static void drink(Cat cat , Double amount)
    {

        if( cat.getWeight()< cat.MIN_WEIGHT) {
            cat.count=cat.count-1;
            System.out.println("Your cat is fucking dead, it can`t drink!");
        }
        else
            cat.setWeight(cat.getWeight() + amount);

    }
    public static String getStatus(Cat cat)
    {
        if(cat.getWeight() < cat.MIN_WEIGHT) {
            cat.count=cat.count-1;
            return "Dead";
        }
        else if(cat.getWeight() > cat.MAX_WEIGHT) {
            cat.count--;
            return "Exploded";
        }
        else if(cat.getWeight() > cat.getOriginWeight()) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}
