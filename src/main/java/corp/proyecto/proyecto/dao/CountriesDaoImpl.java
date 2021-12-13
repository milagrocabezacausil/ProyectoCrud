package corp.proyecto.proyecto.dao;

import corp.proyecto.proyecto.dto.Countries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import javax.sql.DataSource;
import java.util.List;
/*es una clase que conecta con la base de datos*/
@Repository
public class CountriesDaoImpl implements CountriesDao {
    private static final String INSERT_COUNTRIES = "INSERT INTO COUNTRIES(country_id,country_name,region_id) values (?,?,?)";
    private static final String UPDATE_COUNTRIES = "UPDATE COUNTRIES SET country_name=?,region_id=? WHERE country_id=?";
    private static final String GET_COUNTRIES_ID = "SELECT * FROM COUNTRIES WHERE country_id=? ";
    private static final String DELETE_COUNTRIES="DELETE FROM COUNTRIES WHERE country_id=?";
    private static final String GET_COUNTRIES = "SELECT * FROM COUNTRIES ";


    private JdbcTemplate jdbcTemplate;
    public CountriesDaoImpl (DataSource dataSource){
        jdbcTemplate= new JdbcTemplate(dataSource);
    }


    @Override
    public Countries saveCountries(Countries countries) {
        jdbcTemplate.update(INSERT_COUNTRIES,countries.getCountry_id(),countries.getCountry_name(),countries.getRegion_id());
        return countries;
    }

    @Override

    public Countries updateCountries(Countries countries) {
        jdbcTemplate.update(UPDATE_COUNTRIES,countries.getCountry_name(),countries.getRegion_id(),countries.getCountry_id());
        return countries;
    }

    @Override
    public Countries getById(String country_id) {
       return jdbcTemplate.queryForObject(GET_COUNTRIES_ID,(rs, rowNum) -> {
           return new Countries(rs.getString("country_id"),rs.getString("country_name"), rs.getInt("region_id"));
       },country_id);

    }

    @Override
    public String deleteById(String country_id) {
        jdbcTemplate.update(DELETE_COUNTRIES,country_id);
        return "Country delete with id "+country_id;
    }

    @Override
    public List<Countries> allCountries() {
        return jdbcTemplate.query(GET_COUNTRIES,(rs, rowNum) -> {
                    return new Countries(rs.getString("country_id"),rs.getString("country_name"), rs.getInt("region_id"));
                }
                );
    }
}
