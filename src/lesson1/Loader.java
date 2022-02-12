package lesson1;

public class Loader
{
    public static void main(String[] args)
    {
        Cat dushnila = new Cat();
        Cat zheka = new Cat();
        Cat student = new Cat();
        Cat timofey = new Cat();


       // System.out.println("Dushnila in this moment - " + dushnila.getStatus());
       // System.out.println("Student in this moment - " + student.getStatus());
      // System.out.println("Timofey in this moment - " + timofey.getStatus());
        System.out.println("Zheka in this moment - " + zheka.getStatus());
        zheka.feed(100000.0);
        zheka.feed(10.0);
        //System.out.println(dushnila.getWeight());
        //System.out.println("Dushnila in this moment "+dushnila.getStatus());
        //System.out.println("Cats amount now - "+ Cat.getCount());
        //Придумайте способ, который поможет проверить,
        // жива ли кошка, на основе значения её веса.
        // Используя это, запретите неживой кошке есть,
        // пить, ходить в туалет, выполняя проверку веса
        // внутри методов, которые изменяют вес кошки.

    }
}