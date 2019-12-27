package testjava;

public class CustomerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Customer customer = new Customer();
      customer.setCustomerId(456);
      customer.setCustomerName("harikrishna");
      customer.setCity("hyderabad");
      System.out.println(customer.getCustomerId());
      System.out.println(customer.getCustomerName());
      System.out.println(customer.getCity());
	}
}
