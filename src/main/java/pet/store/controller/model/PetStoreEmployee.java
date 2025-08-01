package pet.store.controller.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import pet.store.entity.Employee;

/////////////////////////////////////////////////////////// week 14 v

@Data
@NoArgsConstructor

public class PetStoreEmployee {

	// pasted from Employee.java:
	private Long employeeId; 

	private String employeeFirstName;
	private String employeeLastName;
	private String employeePhone;
	private String employeeJobTitle;

public PetStoreEmployee(Employee employee) {
	employeeId = employee.getEmployeeId();
	employeeFirstName = employee.getEmployeeFirstName();
	employeeLastName = employee.getEmployeeLastName();
	employeePhone = employee.getEmployeePhone();
	employeeJobTitle = employee.getEmployeeJobTitle();
}




/////////////////////////////////////////////////////////// week 14 ^

}
