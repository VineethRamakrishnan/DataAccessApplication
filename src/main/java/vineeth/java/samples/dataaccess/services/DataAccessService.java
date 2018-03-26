package vineeth.java.samples.dataaccess.services;

import java.util.Collection;

import vineeth.java.samples.dataaccess.data.Employee;

/**
 * 
 * @author v.rama.krishnan
 *
 */

public interface DataAccessService {

	Employee saveEmployee(Employee emp);

	Employee getEmployee(Long empId);

	Collection<Employee> getAllEmployees();

	Employee updateEmployee(Employee emp);

	String deleteEmployee(Long empId);

}