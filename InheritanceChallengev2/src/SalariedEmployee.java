import java.time.LocalDate;

public class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, LocalDate birthDate, LocalDate hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire(){
        terminate(LocalDate.now());
        isRetired = true;
    }

    @Override
    public double collectPay() {
        if (isRetired){
            return (annualSalary / 12) * 0.9;
        }
        return annualSalary / 12;
    }
}
