package pet.store.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;
@Entity	// class is a JPA entity
@Data	// generates getters and setters

public class Customer {

	@Id	// the following is the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerId; 
	
	private String customerFirstName;
	private String customerLastName;
	private String customerEmail;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToMany(mappedBy = "customers", cascade = CascadeType.PERSIST)  // customers can be associated with many pet stores
	private Set<PetStore> petStores = new HashSet<>();					// pet stores can be associated with many customers
}