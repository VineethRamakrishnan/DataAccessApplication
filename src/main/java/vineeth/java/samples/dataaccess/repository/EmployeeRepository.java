package vineeth.java.samples.dataaccess.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import vineeth.java.samples.dataaccess.data.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	Employee save(Employee emp);

	Employee findByEmployeeId(Long empId);

	@Query("Select employeeId,employeeName from Employee")
	List<Employee> findAll();
		
	void delete(Employee emp); 
}