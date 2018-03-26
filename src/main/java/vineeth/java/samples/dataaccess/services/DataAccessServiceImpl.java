package vineeth.java.samples.dataaccess.services;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vineeth.java.samples.dataaccess.data.Employee;
import vineeth.java.samples.dataaccess.repository.EmployeeRepository;

@Service
public class DataAccessServiceImpl implements DataAccessService {

	@Autowired
	private EmployeeRepository employeeRepository;

	private static final Logger LOGGER = LoggerFactory.getLogger(DataAccessServiceImpl.class);

	public Employee saveEmployee(Employee emp) {

		LOGGER.info("Inside saveEmployee in DataAccessServiceImpl...");
		if (emp.equals(null)) {
			LOGGER.info("Empty Object !!!");
			return null;
		} else {
			return employeeRepository.save(emp);
		}
	}

	public Employee getEmployee(Long empId) {

		LOGGER.info("Inside getEmployee in DataAccessServiceImpl...");
		if (empId.equals(null)) {
			LOGGER.info("ID: NULL !!!");
			return null;
		} else {
			return employeeRepository.findByEmployeeId(empId);
		}
	}

	public Collection<Employee> getAllEmployees() {
		LOGGER.info("Inside getAllEmployees in DataAccessServiceImpl...");

		return employeeRepository.findAll();

	}

	public String updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteEmployee(Integer empId) {
		// TODO Auto-generated method stub
		return null;
	}

}
