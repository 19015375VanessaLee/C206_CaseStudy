
import java.util.ArrayList;

public class CustomerDB extends Customer{
	ArrayList<Customer> customerListArrayList = new ArrayList<Customer>();
	
	public void addCustomer(Customer customer) {
		if (customerListArrayList.contains(customer)==true) {
			System.out.println("Customer existed!");
		}else {
			System.out.println("Customer added!");
		}
	}
	public void viewAllCustomer() {
		System.out.println(customerListArrayList);
	}
	public void delCustomer(String name) {
		if(customerListArrayList.contains(name)==true) {
			customerListArrayList.remove(name);
			System.out.println("Customer deleted!");
		}else {
			System.out.println("Customer does not exist!");
		}
	}
	public void ShowCustomerMenu() {
		System.out.println("Add New Customer");
		System.out.println("View All Customer");
		System.out.println("Delete Customer");

	}
	public void processOption() {
		
	}
	public Customer inputCustomerDetails() {
		return null;
		
	}
	public int selectCustomer() {
		return 0;
		
	}

}

