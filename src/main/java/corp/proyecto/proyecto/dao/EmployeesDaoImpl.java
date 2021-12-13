package corp.proyecto.proyecto.dao;

import corp.proyecto.proyecto.dto.Employees;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeesDaoImpl implements EmployeesDao{

    private static final String INSERT_EMPLOYEES ="INSERT INTO EMPLOYEES(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id) values (?,?,?,?,?,?,?,?,?,?,?)";






    @Override
    public Employees saveEmployees(Employees employees) {
        return null;
    }

    @Override
    public Employees updateEmployees(Employees employees) {
        return null;
    }

    @Override
    public Employees getById(int employee_id) {
        return null;
    }

    @Override
    public String deleteById(int employee_id) {
        return null;
    }

    @Override
    public List<Employees> allEmployees() {
        return null;
    }
}
