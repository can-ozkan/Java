public class Customer {

    private String customerName;
    private double customerCreditLimit;
    private String customerEmail;

    public Customer(String customerName, double customerCreditLimit, String customerEmail) {
        this.customerName = customerName;
        this.customerCreditLimit = customerCreditLimit;
        this.customerEmail = customerEmail;
    }

    public Customer(){
        this("no name given", 0.0, "no email provided");
    }

    public Customer(String customerName, String customerEmail) {
        this(customerName,0.0, customerEmail);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getCustomerCreditLimit() {
        return customerCreditLimit;
    }

    public void setCustomerCreditLimit(double customerCreditLimit) {
        this.customerCreditLimit = customerCreditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
