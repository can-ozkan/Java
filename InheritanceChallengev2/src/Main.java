import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2017,1,13);
        System.out.println(date1.getDayOfYear());

        Worker worker1 = new Worker("Can", LocalDate.of(1994,6,8) );
        System.out.println("Worker class - " + worker1.getAge());
        System.out.println("Worker class - " + worker1);

        Employee employee1 = new Employee("Betul", LocalDate.of(1970,6,8)
                , LocalDate.of(2022,1,2) );

        System.out.println("Employee class - " + employee1);
        System.out.println("Employee class - " + employee1.getAge());
        System.out.println("Employee class - " + employee1.getEmployeeId());

        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Hakan", LocalDate.of(1970,6,
                8), LocalDate.of(2022,1,2),
                35000, false);
        System.out.println("SalariedEmployee class " + salariedEmployee1);
        System.out.printf("%.2f\n", salariedEmployee1.collectPay());
        salariedEmployee1.retire();
        System.out.printf("%.2f\n", salariedEmployee1.collectPay());

        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Nuri", LocalDate.of(1970,6,
                8), LocalDate.of(2022,1,2), 50 );
        System.out.println("HourlyEmployee class " + hourlyEmployee1);

    }
}