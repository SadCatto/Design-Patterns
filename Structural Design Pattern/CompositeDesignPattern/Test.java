public class Test {
    public static void main(String[] args) {
        Employee CEO = new Leaf("Noi", "CEO", 10);
        Employee notCeo = new Leaf("noiCeo", "Manager", 15);
        Employee dev = new Leaf("dehadi", "Developer", 100);

        Employee CEOTeam = new Composite();
        Employee ManagerTeam = new Composite();
        Employee berojgarTeam = new Composite();

        berojgarTeam.addEmployee(dev);
        ManagerTeam.addEmployee(notCeo);
        ManagerTeam.addEmployee(berojgarTeam);
        CEOTeam.addEmployee(CEO);
        CEOTeam.addEmployee(ManagerTeam);

        CEOTeam.showDetails();
        int empcost = CEOTeam.Cost();
        System.out.println("\nFinal total cost of hiring: " + empcost);

    }
}