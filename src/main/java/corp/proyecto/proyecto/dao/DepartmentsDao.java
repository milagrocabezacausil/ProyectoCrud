package corp.proyecto.proyecto.dao;
import corp.proyecto.proyecto.dto.Departments;

import java.util.List;

public interface DepartmentsDao {
    Departments saveDepartments(Departments departments);
    Departments updateDepartments(Departments departments);
    Departments getById(Integer departments);
    String deleteById(Integer department_id);
    List<Departments> allDepartments();
}
