package lesson3;

import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.sql.SQLOutput;
import java.util.List;

public  class Main
{

     static Airport airport = Airport.getInstance();


    public static void main(String[] args) {
        System.out.println(airport.getAllAircrafts());
        System.out.println(airport.getAllAircrafts().size());

    }
}
