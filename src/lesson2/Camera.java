package lesson2;

import java.sql.SQLOutput;

public class Camera

{       //Проверяю работают ли сеттеры и геттеры
        public static String numberCheck()
        {

            getNextCar().setNumber("484");
            return Car.getNumber();


        }
         public static int heightCheck()
        {

            getNextCar().setHeight(228);
            return Car.getHeight();


        }
         public static Double weightCheck()
        {

            getNextCar().setWeight(1488.00);
            return Car.getWeight();


        }
        //Закончил проверять сеттеры и гетеры
        public static void main(String[] args) {



            System.out.println(weightCheck());

        }

        public static Car getNextCar() {
        String randomNumber = Double.toString(Math.random()).substring(2, 5);
        int randomHeight = (int) (1000 + 3500. * Math.random());
        double randomWeight = 600 + 10000 * Math.random();

        Car car = new Car();
        car.number = randomNumber;
        car.height = randomHeight;
        car.weight = randomWeight;
        car.hasVehicle = Math.random() > 0.5;
        car.isSpecial = Math.random() < 0.15;

        return car;
    }
}