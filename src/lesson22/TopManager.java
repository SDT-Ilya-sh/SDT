package lesson22;

public class TopManager implements Employee {

    @Override
    public int getMonthSalary() {
        if (Company.getCompanyIncome() > 10000000) {
            return 150000 + (int) (1.5 * 150000);
        }
        return 150000;
    }
}
