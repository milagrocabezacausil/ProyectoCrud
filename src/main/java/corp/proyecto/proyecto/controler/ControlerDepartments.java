package corp.proyecto.proyecto.controler;


import corp.proyecto.proyecto.dto.Countries;
import corp.proyecto.proyecto.dto.Departments;
import corp.proyecto.proyecto.service.ServiceDepartments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyectoHr")
public class ControlerDepartments {

    @Autowired
    ServiceDepartments service;

    @PostMapping("/saveDepartments")
    public Departments saveDepartments (@RequestBody Departments departments)
    {
        return service.saveDepartments(departments);
    }
    @PutMapping("/updateDepartments")
    public Departments updateDepartments (@RequestBody Departments departments)
    {
        return  service.updateDepartments(departments);
    }
    @GetMapping("/getByIdDepartments/{id}")
    public Departments getByIdDepartments (@PathVariable("id") int department_id){
        return service.getById(department_id);
    }
    @DeleteMapping("/deleteByIdDepartments/{id}")
    public String deleteByIdDepartments (@PathVariable("id") int department_id){
        return service.deleteById(department_id);
    }
    @GetMapping ("/allDepartments")
    public List<Departments> allDepartments(){

        return service.allDepartments();
    }
}
