public class SalariedEmployee extends Employee {
    private double weeklySalary;

    // four-argument constructor
    public SalariedEmployee(String first, String last, String ssn, double salary) {
        super(first, last, ssn); // pass to Employee constructor
        setWeeklySalary(salary); // validate and store salary
    } // end four-argument SalariedEmployee constructor

    // set salary
    public void setWeeklySalary(double salary) {
        weeklySalary = salary < 0.0 ? 0.0 : salary;
    } // end Method setWeeklySalary

    // return salary
    public double getWeeklySalary() {
        return weeklySalary;
    } // end Method getWeeklySalary

    // calculate earnings; override abstract Method earnings in Employee
    @Override
    public double earnings() {
        return getWeeklySalary();
    } // end Method earnings

    // return String representation of SalariedEmployee Object
    @Override
    public String toString() {
        return String.format("salaried employee: %s\n%s: $%,.2f",
            super.toString(), "weekly salary", getWeeklySalary());
    } // end Method toString

    public static void main(String[] args) {
        SalariedEmployee employee = new SalariedEmployee(
            "John", "Smith", "111-11-1111", 800.00
        );
        System.out.println(employee);
        System.out.printf("%n%s: $%,.2f%n", "earnings", employee.earnings());
    }
} // end class SalariedEmployee