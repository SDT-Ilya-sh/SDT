package lesson1;

public class Loader
{
    public static void main(String[] args)
    {
        Cat vasya = new Cat(2500.00);
        Cat.getKitten();
        System.out.println(Cat.getCount());
        System.out.println(Cat.getKitten().getWeight());
    }
}