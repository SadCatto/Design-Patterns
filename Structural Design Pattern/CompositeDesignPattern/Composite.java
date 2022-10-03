import java.util.ArrayList;

public class Composite implements Employee {

    private ArrayList<Employee> subordinates = new ArrayList<Employee>();

    public void showDetails() {
        for (Employee emp : subordinates) {
            emp.showDetails();
        }
    }

    public void addEmployee(Employee e) {
        subordinates.add(e);
    }

    public void removeEmployee(Employee e) {
        subordinates.remove(e);
    }

    public int Cost() {
        int empcost = 0;
        for (Employee e : subordinates) {
            empcost = empcost + e.Cost();
        }
        return empcost;
    }

}
