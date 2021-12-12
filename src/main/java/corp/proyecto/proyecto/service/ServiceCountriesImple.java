package corp.proyecto.proyecto.service;

import corp.proyecto.proyecto.dao.CountriesDao;
import corp.proyecto.proyecto.dto.Countries;
import corp.proyecto.proyecto.dto.Departments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class ServiceCountriesImple  implements ServiceCountries {
    private final Logger log = LoggerFactory.getLogger(ServiceCountriesImple.class);
    @Autowired
    private CountriesDao dao;


    @Override
    public Countries saveCountries(Countries countries) {
        return dao.saveCountries(countries);
    }

    @Override
    public Countries updateCountries(Countries countries) {
        return dao.updateCountries(countries);
    }

    @Override
    public Countries getById(String country_id) {
        return dao.getById(country_id);
    }

    @Override
    public String deleteById(String country_id) {
        return dao.deleteById(country_id);
    }

    @Override
    public List<Countries> allCountries() {
        return dao.allCountries();
    }
}
