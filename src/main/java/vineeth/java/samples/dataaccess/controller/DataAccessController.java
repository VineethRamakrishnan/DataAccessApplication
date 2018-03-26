package vineeth.java.samples.dataaccess.controller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vineeth.java.samples.dataaccess.data.Employee;
import vineeth.java.samples.dataaccess.services.DataAccessService;

@RestController
@RequestMapping("/employee")
public class DataAccessController {

	/**
	 * Use Logger instead of printing the values in console...!
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(DataAccessController.class);

	@Autowired
	private DataAccessService service;

	public DataAccessController() {

		//this.service = service;
	}

	/**
	 * 
	 * @return
	 */
	@PostMapping(value = "/create")
	public Employee createEmployee(@RequestBody Employee emp) {

		LOGGER.info("Good work..!! Inside createEmployee Log displayed");
		LOGGER.info("Employee object :" + emp);
		return service.saveEmployee(emp);

	}

	/**
	 * PathVariable annotation must be same as the placeholder in the URL which is
	 * specified in @RequestMapping otherwise we should make use
	 * of @PathVariable(value="id")
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/get/{employeeId}")
	public Employee getEmployee(@PathVariable Long employeeId) {

		LOGGER.info("Good work..!! Inside getEmployee Log displayed");
		LOGGER.info("id value:" + employeeId);
		return service.getEmployee(employeeId);
	}

	/**
	 * 
	 * @return
	 */
	@GetMapping(value = "/getAll")
	public Collection<Employee> getAllEmployees() {

		LOGGER.info("Good work..!! Inside getAllEmployees Log displayed");
		return service.getAllEmployees();

	}

	/**
	 * 
	 * @param employeeId
	 * @return
	 */
	@PutMapping(value = "/update/{id}")
	public String updateEmployee(@PathVariable(value = "id") Long employeeId) {

		LOGGER.info("id value:" + employeeId);
		return "Successfully updated!";
	}

	/**
	 * 
	 * @param employeeId
	 * @return
	 */
	@DeleteMapping(value = "/delete/{id}")
	public String deleteEmployee(@PathVariable(value = "id") Long employeeId) {

		LOGGER.info("id value:" + employeeId);
		return "Successsfully deleted!";
	}
}
