public class Leaf implements Employee {
    String name;
    String designation;
    int cost;

    public Leaf(String n, String d, int c) {
        this.name = n;
        this.designation = d;
        this.cost = c;

    }

    public void showDetails() {
        System.out.println("Name: " + this.name + " Designation: " + this.designation + " Hiring Cost: " + this.cost);
    }

    public void addEmployee(Employee e) {
        // subordinates.add(this);
    }

    public void removeEmployee(Employee e) {
        // subordinates.remove(this);
    }

    public int Cost() {
        return this.cost;
    }
}
