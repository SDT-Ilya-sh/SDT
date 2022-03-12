package lesson22;


public class Main {

    public static void main(String[] args) {
        Company cola = new Company();
        cola.setCompanyIncome(12000000);
        cola.hireAllWorkers(PersonnelDepartment.hireOperators(180));
        cola.hireAllWorkers(PersonnelDepartment.hireManagers(80));
        cola.hireAllWorkers(PersonnelDepartment.hireTopManagers(10));
        cola.printTopSalaryStaff(10);
        cola.printLowSalaryStaff(10);
        cola.fireSomeWorkers(135);
        cola.printTopSalaryStaff(20);
        cola.printLowSalaryStaff(20);




    }
}

