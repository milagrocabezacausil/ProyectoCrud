package corp.proyecto.proyecto.service;

import corp.proyecto.proyecto.dto.Countries;

import java.util.List;

public interface ServiceCountries {
    Countries saveCountries(Countries countries);
    Countries updateCountries(Countries countries);
    Countries getById (String country_id);
    String deleteById(String country_id);
    List<Countries> allCountries();
}
