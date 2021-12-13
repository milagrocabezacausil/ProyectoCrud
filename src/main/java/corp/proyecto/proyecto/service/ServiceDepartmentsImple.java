package corp.proyecto.proyecto.service;
import corp.proyecto.proyecto.dao.DepartmentsDao;
import corp.proyecto.proyecto.dto.Departments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class ServiceDepartmentsImple implements ServiceDepartments {
    private final Logger log = LoggerFactory.getLogger(ServiceDepartmentsImple.class);
    @Autowired
    private DepartmentsDao dao;


    @Override
    public Departments saveDepartments(Departments departments) {
        return dao.saveDepartments(departments);
    }

    @Override
    public Departments updateDepartments(Departments departments) {
        return dao.updateDepartments(departments);
    }

    @Override
    public Departments getById(int department_id) {
        return dao.getById(department_id);
    }

    @Override
    public String deleteById(int department_id) {
        return dao.deleteById(department_id);
    }

    @Override
    public List<Departments> allDepartments() {
        return dao.allDepartments();
    }
}
