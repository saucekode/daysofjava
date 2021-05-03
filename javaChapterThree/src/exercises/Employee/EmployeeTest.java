//Test the employee application here
package exercises.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee amakaEmployee = new Employee();
        Employee kellyEmployee = new Employee();

        amakaEmployee.setFirstName("Chiamaka");
        amakaEmployee.setLastName("Mbah");
        amakaEmployee.setMonthlySalary(-120000);
        amakaEmployee.setSalaryRaise(10);
        System.out.println(amakaEmployee.getFullName() + "'s new salary is " + "$" + amakaEmployee.getMonthlySalary() + "\n");

        kellyEmployee.setFirstName("Kelly");
        kellyEmployee.setLastName("Rowland");
        kellyEmployee.setMonthlySalary(610000);
        kellyEmployee.setSalaryRaise(10);
        System.out.println(kellyEmployee.getFullName() + "'s new salary is " + "$" + kellyEmployee.getMonthlySalary());
    }
}
