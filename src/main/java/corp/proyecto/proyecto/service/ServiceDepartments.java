package corp.proyecto.proyecto.service;

import corp.proyecto.proyecto.dto.Countries;
import corp.proyecto.proyecto.dto.Departments;

import java.util.List;

public interface ServiceDepartments {
    Departments saveDepartments(Departments departments);
    Departments updateDepartments(Departments departments);
    Departments getById(int departments);
    String deleteById(int department_id);
    List<Departments> allDepartments();
}
