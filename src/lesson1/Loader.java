package lesson1;

public class Loader
{
    private static Cat getKitten()
    {
        Cat cat = new Cat(1100.00);
        return cat;

    }
    public static void main(String[] args)
    {

        getKitten();
        getKitten();
        System.out.println(getKitten().getWeight());
        System.out.println(getKitten().getStatus());
        System.out.println(Cat.getCount());

    }
}