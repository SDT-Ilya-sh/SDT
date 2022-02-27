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
        CatLogic.drink(white,1488.00);
        CatLogic.meow(black);
        CatLogic.feed(red,228.0);


    }
}
