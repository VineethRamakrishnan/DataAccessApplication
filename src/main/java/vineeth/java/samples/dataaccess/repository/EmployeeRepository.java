package vineeth.java.samples.dataaccess.repository;

import java.util.Collection;

import org.springframework.data.repository.Repository;

import vineeth.java.samples.dataaccess.data.Employee;

public interface EmployeeRepository extends Repository<Employee, Long> {

	Employee save(Employee emp);

	Employee findByEmployeeId(Long empId);

	//@Query("Select id,Name from employee_Table")
	Collection<Employee> findAll();
	
	/**
	 * Employee update(Employee emp);
	 */
	
	Employee delete(Employee emp); 
}