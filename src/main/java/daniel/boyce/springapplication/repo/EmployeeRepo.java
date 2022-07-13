package daniel.boyce.springapplication.repo;

import daniel.boyce.springapplication.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee,Long> {
}
