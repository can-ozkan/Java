public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("tim", 1000, "tim@test.com");
        Customer customer2 = new Customer();
        Customer customer3 = new Customer("can", "can@test.com");

        System.out.println(customer1.getCustomerEmail());
        System.out.println(customer1.getCustomerName());
        System.out.println(customer1.getCustomerCreditLimit());
        System.out.println(customer2.getCustomerEmail());
        System.out.println(customer2.getCustomerName());
        System.out.println(customer2.getCustomerCreditLimit());
        System.out.println(customer3.getCustomerEmail());
        System.out.println(customer3.getCustomerName());
        System.out.println(customer3.getCustomerCreditLimit());
    }
}