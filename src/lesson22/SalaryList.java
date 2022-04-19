package lesson22;

import java.util.*;

public abstract class SalaryList{
    public static ArrayList<Integer> getSalaryList(HashMap<Employee, Integer> list) {
        ArrayList<Integer> salaryList = new ArrayList<>();
        for (Employee key : list.keySet()) {
            salaryList.add(list.get(key));
        }
        Collections.sort(salaryList);
        return salaryList;
    }

}
