package com.nachospring.holamundo.service;

import java.util.List;

import com.nachospring.holamundo.model.Continent;
import com.nachospring.holamundo.model.Country;
import com.nachospring.holamundo.repository.ICountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService implements ICountryService {

    @Autowired
    ICountryRepository repo;

	@Override
	public List<Country> findCountriesByName(String continentName) {
        Continent cont = Continent.continentByName(continentName);
        switch (cont) {
            case EUROPE:
                return repo.findAllEuropeCountries();
            case AFRICA:
                return repo.findAllAfricanCountries();
            default:
                return null;
        }
	}

    
}