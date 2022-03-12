package lesson22;

public class Manager implements Employee {

    @Override
    public int getMonthSalary() {
        return 60000 + (int) (0.05 * 115000 + (Math.random() * 25000));
    }

}
