import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import com.example.Employee;


@Transactional
public class EmployeeDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void saveEmployee(Employee employee) {
        entityManager.persist(employee);
    }

    public Employee getEmployeeById(Long id) {
        return entityManager.find(Employee.class, id);
    }

    public void updateEmployee(Employee employee) {
        entityManager.merge(employee);
    }

    public void deleteEmployeeById(Long id) {
        Employee employee = getEmployeeById(id);
        if (employee != null) {
            entityManager.remove(employee);
        }
    }

    @SuppressWarnings("unchecked")
    public List<Employee> getAllEmployees() {
        return entityManager.createQuery("from Employee").getResultList();
    }
}
