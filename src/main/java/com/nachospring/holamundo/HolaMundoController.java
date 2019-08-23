package com.nachospring.holamundo;

import java.util.List;

import com.nachospring.holamundo.model.Country;
import com.nachospring.holamundo.service.ICountryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController // Exponer un servicio REST
public class HolaMundoController {

    @Autowired
    ICountryService serv;

    @GetMapping("/countries/continent/{continent}") // Rutas que se le va a hacer
    public List<Country> holaMundo(@PathVariable String continent) { // GET /{ }
        return serv.findCountriesByName(continent);
    }

    // @QuerryParam - POST /abd/xyz?param1=val1&param2 = val2
    /*
     * De lo que ha definido HTTP, Headers hay una serie (Accept, Content-Type)
     */

}