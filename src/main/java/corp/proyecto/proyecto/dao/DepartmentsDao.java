package corp.proyecto.proyecto.dao;
import corp.proyecto.proyecto.dto.Departments;

import java.util.List;

public interface DepartmentsDao {
    Departments saveDepartments(Departments departments);
    Departments updateDepartments(Departments departments);
    Departments getById(int departments);
    String deleteById(int department_id);
    List<Departments> allDepartments();
}
