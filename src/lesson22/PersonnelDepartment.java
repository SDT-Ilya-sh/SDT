package lesson22;

import java.util.HashMap;

public class PersonnelDepartment {
    public static HashMap<Employee, Integer> hireManagers(int count) {
        HashMap<Employee, Integer> managersList = new HashMap<>();
        for (int i = 0; i < count; i++) {
            managersList.put(new Manager(), new Manager().getMonthSalary());
        }
        return managersList;
    }

    public static HashMap<Employee, Integer> hireOperators(int count) {
        HashMap<Employee, Integer> operatorsList = new HashMap<>();
        for (int i = 0; i < count; i++) {
            operatorsList.put(new Operator(), new Operator().getMonthSalary());
        }
        return operatorsList;
    }

    public static HashMap<Employee, Integer> hireTopManagers(int count) {
        HashMap<Employee, Integer> topManagersList = new HashMap<>();
        for (int i = 0; i < count; i++) {
            topManagersList.put(new TopManager(), new TopManager().getMonthSalary());
        }
        return topManagersList;
    }
}
