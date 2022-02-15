package BeerSong;

public class Main {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "Бутылок(бутылки)";

        while ( beerNum >0){

                if(beerNum == 1) {
                    word = "Бутылка";

                }
            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum--;

            if (beerNum==0)
            {
                System.out.println("Нет бутылок пива на стене");
            }
        }

    }
}
