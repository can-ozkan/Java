import java.time.LocalDate;

public class HourlyEmployee extends Employee{

    private double hourlyPayRate;

    public HourlyEmployee(String name, LocalDate birthDate, LocalDate hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getDoublePay(){
        return 2 * collectPay();
    }

    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }
}
