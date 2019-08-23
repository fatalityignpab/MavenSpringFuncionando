package com.nachospring.holamundo.repository;

import java.util.List;

import com.nachospring.holamundo.model.Country;
import com.nachospring.holamundo.model.utils.AfricaContinentList;
import com.nachospring.holamundo.model.utils.EuropeContinentList;

import org.springframework.stereotype.Repository;

@Repository
public class CountryRepositor implements ICountryRepository {

    @Override
    public List<Country> findAllAfricanCountries() {
        return AfricaContinentList.getAllAfricanCountries();
    }

	@Override
	public List<Country> findAllEuropeCountries() {
		return EuropeContinentList.getAllEuropeCountries();
	}

    
}