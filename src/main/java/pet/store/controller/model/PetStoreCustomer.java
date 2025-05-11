package pet.store.controller.model;
/////////////////////////////////////////////////////////// week 14 v


import lombok.Data;
import lombok.NoArgsConstructor;
import pet.store.entity.Customer;

@Data
@NoArgsConstructor

public class PetStoreCustomer {

// pasted from Customer.java:
	private Long customerId; 
	private String customerFirstName;
	private String customerLastName;
	private String customerEmail;

	public PetStoreCustomer(Customer customer) {
		customerId = customer.getCustomerId();
		customerFirstName = customer.getCustomerFirstName();
		customerLastName = customer.getCustomerLastName();
		customerEmail = customer.getCustomerEmail();
	}
}	




/////////////////////////////////////////////////////////// week 14 ^

