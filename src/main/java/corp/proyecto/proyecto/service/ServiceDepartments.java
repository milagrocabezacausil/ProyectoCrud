package corp.proyecto.proyecto.service;

import corp.proyecto.proyecto.dto.Countries;
import corp.proyecto.proyecto.dto.Departments;

import java.util.List;

public interface ServiceDepartments {
    Departments saveDepartments(Departments departments);
    Departments updateDepartments(Departments departments);
    Departments getById(Integer departments);
    String deleteById(Integer department_id);
    List<Departments> allDepartments();
}
