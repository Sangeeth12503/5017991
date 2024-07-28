
public class TestDependency {
     public static void main(String[] args) {
        
        CustomerRepository customerRepository = new CustomerRepositoryImplementation();

        CustomerService customerService = new CustomerService(customerRepository);

        String customer = customerService.getCustomer("1011");
        System.out.println(customer);
    }
}
