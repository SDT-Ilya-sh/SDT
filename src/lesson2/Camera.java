package lesson2;

import java.sql.SQLOutput;

public class Camera

{
        public static void main(String[] args) {
                System.out.println(getNextCar().getNumber());
                System.out.println(getNextCar().getWeight());
                System.out.println(getNextCar().getHeight());
                System.out.println(getNextCar().getIsSpecial());
                System.out.println(getNextCar().getHasVehicle());
        }

        public static Car getNextCar() {
        String randomNumber = Double.toString(Math.random()).substring(2, 5);
        int randomHeight = (int) (1000 + 3500. * Math.random());
        double randomWeight = 600 + 10000 * Math.random();

        Car car = new Car();
        car.setNumber(randomNumber);
        car.setHeight(randomHeight);
        car.setWeight(randomWeight);
        car.setHasVehicle(Math.random() > 0.5);
        car.setIsSpecial(Math.random() < 0.15);

        return car;
    }
}