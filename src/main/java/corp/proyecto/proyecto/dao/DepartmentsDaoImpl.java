package corp.proyecto.proyecto.dao;


import corp.proyecto.proyecto.dto.Departments;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class DepartmentsDaoImpl implements DepartmentsDao {
    private static final String INSERT_DEPARTMENTS = "INSERT INTO DEPARTMENTS(department_id,department_name,manager_id,location_id) values (?,?,?,?)";
    private static final String UPDATE_DEPARTMENTS = "UPDATE DEPARTMENTS SET department_name=?,manager_id=?,location_id=? WHERE department_id=?";
    private static final String GET_DEPARTMENTS_ID = "SELECT * FROM DEPARTMENTS WHERE department_id=? ";
    private static final String DELETE_DEPARTMENTS="DELETE FROM DEPARTMENTS WHERE department_id=?";
    private static final String GET_DEPARTMENTS = "SELECT * FROM DEPARTMENTS ";




    private JdbcTemplate jdbcTemplate;
    public DepartmentsDaoImpl (DataSource dataSource){
        jdbcTemplate= new JdbcTemplate(dataSource);
    }

    @Override
    public Departments saveDepartments(Departments departments) {
        jdbcTemplate.update(INSERT_DEPARTMENTS,departments.getDepartment_id(),departments.getDepartment_name(),departments.getManager_id(),departments.getLocation_id());
        return departments;
    }

    @Override
    public Departments updateDepartments(Departments departments) {
        jdbcTemplate.update(UPDATE_DEPARTMENTS,departments.getDepartment_name(),departments.getManager_id(),departments.getLocation_id(),departments.getDepartment_id());
        return departments;
    }

    @Override
    public Departments getById(int department_id) {
        return jdbcTemplate.queryForObject(GET_DEPARTMENTS_ID,(rs, rowNum) -> {
            return new Departments(rs.getInt("department_id"),rs.getString("department_name"), rs.getInt("manager_id"),rs.getInt("location_id"));
        },department_id);

    }

    @Override
    public String deleteById(int department_id) {
        jdbcTemplate.update(DELETE_DEPARTMENTS,department_id);
        return "Department delete with id "+department_id;
    }

    @Override
    public List<Departments> allDepartments() {
        return jdbcTemplate.query(GET_DEPARTMENTS,(rs, rowNum) -> {
                    return new Departments(rs.getInt("department_id"),rs.getString("department_name"),rs.getInt("manager_id"),rs.getInt("location_id"));
                }
        );
    }
}
