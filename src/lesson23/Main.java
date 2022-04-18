package lesson23;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> staff = LoadStaff.loadStaffFromFile();
        SortingCollections.sortCollection(staff);
        for ( Employee employee : staff){
            System.out.println(employee.toString());
        }
    }

}