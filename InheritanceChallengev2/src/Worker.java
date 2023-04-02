import java.time.LocalDate;
import java.time.Year;
import java.util.Date;

public class Worker {

    private String name;
    private LocalDate birthDate;
    protected LocalDate endDate;

    public Worker(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;

    }

    public int getAge(){
        return Year.now().getValue() - birthDate.getYear();
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(LocalDate endDate){
        System.out.println("Your contract is terminated at " + endDate.toString());
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", endDate=" + endDate +
                '}';
    }
}
