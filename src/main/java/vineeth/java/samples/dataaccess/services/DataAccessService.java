package vineeth.java.samples.dataaccess.services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import vineeth.java.samples.dataaccess.data.Employee;

/**
 * 
 * @author v.rama.krishnan
 *
 */
@Service
public interface DataAccessService {

	Employee saveEmployee(Employee emp);

	Employee getEmployee(Long empId);

	Collection<Employee> getAllEmployees();

	String updateEmployee(Employee emp);

	String deleteEmployee(Integer empId);

}