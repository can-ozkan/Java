import java.util.ArrayList;

public record Customer(String name, ArrayList<Double> transactions) {

    public Customer(String name, double initialDeposit){
        this(name.toUpperCase(), new ArrayList<Double>());
        transactions.add(initialDeposit);
    }
}
