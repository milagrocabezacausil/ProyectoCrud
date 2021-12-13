package corp.proyecto.proyecto.dao;

import corp.proyecto.proyecto.dto.Countries;
import corp.proyecto.proyecto.dto.Employees;

import java.util.List;

public interface EmployeesDao {
    Employees saveEmployees(Employees employees);
    Employees updateEmployees(Employees employees);
    Employees getById (int employee_id);
    String deleteById(int employee_id);
    List<Employees> allEmployees();
}
