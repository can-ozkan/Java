import java.time.LocalDate;

public class Employee extends Worker{

    private static int EMPLOYEE_ID = 0;
    private LocalDate hireDate;
    private int employeeId;

    public Employee(String name, LocalDate birthDate, LocalDate hireDate) {
        super(name, birthDate);
        Employee.EMPLOYEE_ID++;
        this.hireDate = hireDate;
        this.employeeId = Employee.EMPLOYEE_ID;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hireDate=" + hireDate +
                ", employeeId=" + employeeId +
                ", endDate=" + endDate +
                "} " + super.toString();
    }
}
