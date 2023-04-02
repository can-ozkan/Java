import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    private Customer getCustomer(String customerName){
        for (var customer : customers){
            if (customerName.equalsIgnoreCase(customer.name())){
                return customer;
            }
        }

        System.out.printf("Customer %s was not found\n", customerName);
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit ){
        if (getCustomer(customerName) == null){
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("New customer is added " + customer);
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    public void addTransaction(String name, double transactionAmount){
        Customer customer = getCustomer(name);

        if (customer != null){
            customer.transactions().add(transactionAmount);
        }
    }

    public void printStatement(String customerName){
        Customer customer = getCustomer(customerName);

        if (customer == null){
            return;
        }

        System.out.println("-".repeat(30));
        System.out.println("Customer Name: " + customer.name());
        System.out.println("Transactions: ");
        for (double d : customer.transactions()){ // unboxing
            System.out.printf("$%10.2f (%s)\n", d, d < 0 ? "debit" : "credit");
        }
    }
}
