package lesson1;

public class Loader {

    private static Cat getKitten() {
        Cat cat = new Cat(1100.00);
        return cat;

    }

    public static void main(String[] args) {

        Cat white = new Cat("Nigger" );
        Cat nigga = white.getclone() ;
        System.out.println(white.getWeight());
        System.out.println(nigga.getCatColor());
        System.out.println(nigga.getWeight());
        System.out.println(Cat.getCount());

    }
}
