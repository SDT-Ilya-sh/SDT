package lesson4;

import lesson1.Cat;

public class Main {

    Cat vasya = new Cat();
    Cat murka = vasya;

    public static void main(String[] args) {

        int vaskaAge = 28;
        int murkoAge = vaskaAge;
        murkoAge++;
        System.out.println("Возраст Васьки "+vaskaAge + " " + "Возраст мурки " + murkoAge);



    }
}
