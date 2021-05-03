package exercises.Employee;

public class Employee {
    private  String firstName;
    private String lastName;
    private double monthlySalary;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
        if(monthlySalary < 0){
            this.monthlySalary = 0.0;
        }
    }

    public void setSalaryRaise(double percentageValue){
        monthlySalary = (percentageValue/100 * monthlySalary) + monthlySalary;
    }
}
