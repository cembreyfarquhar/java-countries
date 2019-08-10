package chancehalo.me.countries;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Managed by Spring Boot
@RequestMapping("/data") // all endpoints start with /data/
public class CountryController {
    @GetMapping(value = "/allcountries")
    public ResponseEntity<?> getAllCountries() {
        return new ResponseEntity<>(CountriesApplication.ourCountryList.countryList, HttpStatus.OK);
    }

    @GetMapping(value = "/countries/{id}")
    public ResponseEntity<?> getEmpDetail(@PathVariable long id) {
        Country returnCountry = CountriesApplication.ourCountryList.findCountry(e -> (e.getId() == id));
        return new ResponseEntity<>(returnCountry, HttpStatus.OK);
    }
}

