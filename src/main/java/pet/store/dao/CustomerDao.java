package pet.store.dao;
/////////////////////////////////////////////////////////// week 15 v

import org.springframework.data.jpa.repository.JpaRepository;

import pet.store.entity.Customer;

public interface CustomerDao extends JpaRepository<Customer, Long> {

}
/////////////////////////////////////////////////////////// week 15 ^

