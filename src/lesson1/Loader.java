package lesson1;

public class Loader
{
<<<<<<< HEAD
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

=======
    public static void main(String[] args)
    {
        Cat vasya = new Cat(2500.00);
        Cat.getKitten();
        System.out.println(Cat.getCount());
        System.out.println(Cat.getKitten().getWeight());
>>>>>>> c56d713ccd16803612726f0fd57165890cb9301c
    }
}