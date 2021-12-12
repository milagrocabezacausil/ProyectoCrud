package corp.proyecto.proyecto.controler;

import corp.proyecto.proyecto.dto.Countries;
import corp.proyecto.proyecto.service.ServiceCountries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*Indicar que es un controlador <3*/
@RestController

public class ControlerCountries {
    @Autowired
    ServiceCountries service;

    @PostMapping("/saveCountries")
    public Countries saveCountries (@RequestBody Countries countries)
    {
        return service.saveCountries(countries);
    }
    @PutMapping ("/updateCountries")
    public Countries updateCountries (@RequestBody Countries countries)
    {
        return  service.updateCountries(countries);
    }

    @PostMapping("/getByIdCountries/{id}")
    public Countries getByIdCountries (@PathVariable("id") String country_id){
        return service.getById(country_id);
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteByIdCountries (@PathVariable("id") String country_id){
        return service.deleteById(country_id);
    }
    @PostMapping ("/allCountries")
    public List<Countries> allCountries(){
        return service.allCountries();
    }
}
