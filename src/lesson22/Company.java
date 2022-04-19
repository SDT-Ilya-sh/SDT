package lesson22;


import java.util.*;
import java.util.Map;

public class Company {
    private static int companyIncome;
    private final HashMap<Employee, Integer> workersList;
    private final List<Employee> lowStaffSalary;
    private final List<Employee> topStaffSalary;

    Company() {
        this.workersList = new HashMap<>();
        this.lowStaffSalary = new ArrayList<>();
        this.topStaffSalary = new ArrayList<>();
    }

    public void hireWorker(Employee employee) {
        workersList.put(employee, employee.getMonthSalary());
    }

    public void fireWorker(Employee employee) {
        workersList.remove(employee);
    }

    public void fireSomeWorkers(int amount) {
        int j = 0;
        Iterator<Map.Entry<Employee, Integer>> iterator = workersList.entrySet().iterator();
        while (iterator.hasNext()) {
            if (j == amount) {
                break;
            }
            iterator.next();
            iterator.remove();
            j++;
        }
        System.out.println("Работники успешно уволены. Количество работников на данный момент - " + workersList.size());
    }


    public void hireAllWorkers(HashMap<Employee, Integer> list) {
        workersList.putAll(list);
    }

    public HashMap<Employee, Integer> getWorkersList() {
        return workersList;
    }

    public void printWorkersList(HashMap<Employee, Integer> list) {
        for (Employee key : list.keySet()) {
            System.out.println(key);
        }
    }

    public static int getCompanyIncome() {
        return companyIncome;
    }

    public void setCompanyIncome(int companyIncome) {
        Company.companyIncome = companyIncome;
    }

    private List<Employee> getTopSalaryStaff(int count) {
        int j = 0;
        List<Integer> topSalaryList = new ArrayList<>(workersList.values());
        Collections.sort(topSalaryList);
        if (count > topSalaryList.size() || count <= 0) {
            System.out.println("Данные введены неверно!");
            System.exit(1);
        } else {
            for (int i = topSalaryList.size() - 1; i > 0; i--) {
                if (j == count) {
                    break;
                }
                topStaffSalary.add(getKey(workersList, topSalaryList.get(i)));

                j++;
            }

        }
        return topStaffSalary;
    }

    public void printTopSalaryStaff(int count) {
        List<Integer> topSalaryList = new ArrayList<>(workersList.values());
        Collections.sort(topSalaryList);
        int k = 0;
        System.out.println("Список работников с самой высокой зарплатой :");
        for (int i = topSalaryList.size() - 1; i >= 0; i--) {
            if (k == count) {
                break;
            }
            System.out.println(getTopSalaryStaff(count).get(count - 1) + ", Его зарплата " + topSalaryList.get(i));
            count--;
        }
    }


    private List<Employee> getLowSalaryStaff(int count) {
        List<Integer> topSalaryList = new ArrayList<>(workersList.values());
        int j = 0;
        Collections.sort(topSalaryList);
        if (count > topSalaryList.size() || count <= 0) {
            System.out.println("Данные введены неверно!");
            System.exit(1);
        } else {
            for (int i = topSalaryList.size() - 1; i >= 0; i--) {
                if (j == count) {
                    break;
                }
                lowStaffSalary.add(getKey(workersList, topSalaryList.get(i)));
                j++;
            }
        }
        return lowStaffSalary;
    }

    public void printLowSalaryStaff(int count) {
        List<Integer> topSalaryList = new ArrayList<>(workersList.values());
        Collections.sort(topSalaryList);
        int k = 0;
        System.out.println("Список работников с самой низкой зарплатой :");
        for (Integer integer : topSalaryList) {
            if (k == count) {
                break;
            }
            System.out.println(getLowSalaryStaff(count).get(count - 1) + ", Его зарплата " + integer);
            count--;
        }
    }

    private Employee getKey(HashMap<Employee, Integer> map, int input) {
        for (Employee keyCheck : this.workersList.keySet()) {
            if (map.get(keyCheck).equals(input)) {
                return keyCheck;
            }
        }
        return null;
    }
}



