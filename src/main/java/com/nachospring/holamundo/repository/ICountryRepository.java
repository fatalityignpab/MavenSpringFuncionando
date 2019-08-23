package com.nachospring.holamundo.repository;

import java.util.List;

import com.nachospring.holamundo.model.Country;

public interface ICountryRepository {

    List<Country> findAllAfricanCountries();
    List<Country> findAllEuropeCountries();
}