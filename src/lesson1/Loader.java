package lesson1;

public class Loader {

    private static Cat getKitten() {
        Cat cat = new Cat(1100.00);
        return cat;

    }

    public static void main(String[] args) {

        Cat white = new Cat(Colors.WHITE);
        Cat black = new Cat(Colors.BLACK);
        Cat red = new Cat(Colors.RED);
        System.out.println(white.getCatColor());
        System.out.println(black.getCatColor());
        System.out.println(red.getCatColor());

    }
}
